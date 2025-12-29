package com.parking.parkngo.mapper;

import com.parking.parkngo.dao.UserTypeDAO;
import com.parking.parkngo.dto.UserTypeDTO;
import com.parking.parkngo.entity.UserType;

public class UserTypeMapper {

    public static UserTypeDTO convertToDTO(UserType userType){
        UserTypeDTO userTypeDTO = new UserTypeDTO();
        userTypeDTO.setId(userType.getId());
        userTypeDTO.setName(userType.getName());
        userTypeDTO.setCode(userType.getCode());
        userTypeDTO.setActive(userType.getActive());
        return userTypeDTO;
    }

    public static UserType convertToEntity(UserTypeDAO userTypeDAO){
        UserType userType = new UserType();
        userType.setName(userTypeDAO.getName());
        userType.setCode(userTypeDAO.getCode());
        userType.setActive(userTypeDAO.getActive());
        return userType;
    }

}
