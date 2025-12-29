package com.parking.parkngo.service;

import com.parking.parkngo.dao.VehicleTypeDAO;
import com.parking.parkngo.dto.ApiDTO;
import com.parking.parkngo.dto.VehicleTypeDTO;
import com.parking.parkngo.entity.VehicleType;
import com.parking.parkngo.exception.ServiceNotFoundException;
import com.parking.parkngo.mapper.VehicleTypeMapper;
import com.parking.parkngo.repository.VehicleTypeRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Service
public class VehicleTypeService {


    @Autowired
    private VehicleTypeRepository vehicleTypeRepository;

    public List<VehicleTypeDTO> findAll() {
        List<VehicleTypeDTO> vehicleTypeDTOS = null;
        List<VehicleType> vehicleTypes = vehicleTypeRepository.findAll();
        if (!vehicleTypes.isEmpty()) {
            vehicleTypeDTOS = vehicleTypes.stream()
                    .map(VehicleTypeMapper::convertToDTO)
                    .collect(Collectors.toList());
        } else {
            throw new ServiceNotFoundException("Data not Found!!");
        }
        return vehicleTypeDTOS;
    }

    public List<VehicleTypeDTO> findAllByActive() {
        List<VehicleTypeDTO> vehicleTypeDTOS = null;
        List<VehicleType> vehicleTypes = vehicleTypeRepository.findAllByActive(true);
        if (!vehicleTypes.isEmpty()) {
            vehicleTypeDTOS = vehicleTypes.stream()
                    .map(VehicleTypeMapper::convertToDTO)
                    .collect(Collectors.toList());
        } else {
            throw new ServiceNotFoundException("Data not Found!!");
        }
        return vehicleTypeDTOS;
    }


    public VehicleTypeDTO findById(Long id) {
        VehicleType vehicleType = vehicleTypeRepository.findById(id)
                .orElseThrow(() -> new ServiceNotFoundException("Data not Found!!"));
        return VehicleTypeMapper.convertToDTO(vehicleType);
    }




//    public VehicleTypeDTO findByIdAndActive(Long id) {
//        VehicleType vehicleType = vehicleTypeRepository.findByIdAndActive(id,true)
//                .orElseThrow(() -> new ServiceNotFoundException("Data not Found!!"));
//        return VehicleTypeMapper.convertToDTO(vehicleType);
//    }

    public ApiDTO save(Long id, VehicleTypeDAO vehicleTypeDAO, String user_id) {
        VehicleType vehicleType = VehicleTypeMapper.convertToEntity(vehicleTypeDAO);
        String message = "";
        if(id == null){
            vehicleType.setCreatedBy(user_id);
            vehicleType.setCreatedAt(LocalDateTime.now());
            message = "Data Created Successfully";
        }else{
            vehicleTypeRepository.findById(id)
                    .orElseThrow(() -> new ServiceNotFoundException("Data not Found!!"));
            vehicleType.setId(id);
            vehicleType.setUpdatedBy(user_id);
            vehicleType.setUpdatedAt(LocalDateTime.now());
            message = "Data Updated Successfully";
        }

        vehicleType = vehicleTypeRepository.save(vehicleType);
        VehicleTypeDTO vehicleTypeDTO = VehicleTypeMapper.convertToDTO(vehicleType);

        ApiDTO<VehicleTypeDTO> responseDTO = ApiDTO
                .<VehicleTypeDTO>builder()
                .status(true)
                .message(message)
                .data(vehicleTypeDTO)
                .build();
        return responseDTO;
    }

    public ApiDTO delete(Long id,String user_id) {

        if (!vehicleTypeRepository.existsById(id)) {
            throw new ServiceNotFoundException("Vehicle type not found with ID: " + id);
        }
        vehicleTypeRepository.deleteById(id);

        ApiDTO<VehicleTypeDTO> responseDTO = ApiDTO
                .<VehicleTypeDTO>builder()
                .status(true)
                .message("Data Deleted Successfully")
                .build();
        return responseDTO;
    }
}