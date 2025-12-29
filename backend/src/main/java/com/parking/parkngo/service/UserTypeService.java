package com.parking.parkngo.service;

import com.parking.parkngo.dao.UserTypeDAO;
import com.parking.parkngo.dto.ApiDTO;
import com.parking.parkngo.dto.UserTypeDTO;
import com.parking.parkngo.dto.VehicleTypeDTO;
import com.parking.parkngo.entity.UserType;
import com.parking.parkngo.exception.ServiceNotFoundException;
import com.parking.parkngo.mapper.UserTypeMapper;
import com.parking.parkngo.mapper.VehicleTypeMapper;
import com.parking.parkngo.repository.UserTypeRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserTypeService {

    @Autowired
    private UserTypeRepository userTypeRepository;

    public List<UserTypeDTO> findAll() {
        List<UserTypeDTO> userTypeDTOS = null;
        List<UserType> userTypes = userTypeRepository.findAll();

        if(!userTypes.isEmpty()) {
            userTypeDTOS = userTypes.stream()
                    .map(UserTypeMapper::convertToDTO)
                    .collect(Collectors.toList());
            return userTypeDTOS;
        } else {
            throw new ServiceNotFoundException("Data not Found!!");
        }
    }


    public List<UserTypeDTO> findAllByActive() {
        List<UserTypeDTO> userTypeDTOS = null;
        List<UserType> userTypes = userTypeRepository.findAllByActive(true);

        if(!userTypes.isEmpty()) {
            userTypeDTOS = userTypes.stream()
                    .map(UserTypeMapper::convertToDTO)
                    .collect(Collectors.toList());
            return userTypeDTOS;
        } else {
            throw new RuntimeException("Data not Found!!");
        }
    }

    public UserTypeDTO findById(Long id) {
        UserType userType = userTypeRepository.findById(id)
                .orElseThrow(() -> new ServiceNotFoundException("Data not Found!!"));
        return UserTypeMapper.convertToDTO(userType);
    }


    public ApiDTO save(Long id, UserTypeDAO userTypeDAO, String user_id) {
        UserType userType = UserTypeMapper.convertToEntity(userTypeDAO);
        String message = "";
        if (id == null) {
            userType.setCreatedBy(user_id);
            userType.setCreatedAt(LocalDateTime.now());
            message = "Data Created Successfully";
        }else{
            userTypeRepository.findById(id)
                    .orElseThrow(() -> new ServiceNotFoundException("Data not Found!!"));
            userType.setId(id);
            userType.setUpdatedBy(user_id);
            userType.setUpdatedAt(LocalDateTime.now());
            message = "Data Updated Successfully";
        }

        userType = userTypeRepository.save(userType);
        UserTypeDTO userTypeDTO = UserTypeMapper.convertToDTO(userType);

        ApiDTO<UserTypeDTO> responseDTO = ApiDTO
                .<UserTypeDTO>builder()
                .status(true)
                .message(message)
                .data(userTypeDTO)
                .build();
        return responseDTO;

    }

    public ApiDTO delete(Long id, String user_id) {

        UserType userType = userTypeRepository.findById(id)
                .orElseThrow(() -> new ServiceNotFoundException("Data not Found!!"));

        userTypeRepository.delete(userType);
//
//        UserTypeDTO userTypeDTO = UserTypeMapper.convertToDTO(userType);
        ApiDTO responseDTO = ApiDTO
                .builder()
                .status(true)
                .message("Data Deleted Successfully")
//                .data(userTypeDTO)
                .build();
        return responseDTO;
    }
}
