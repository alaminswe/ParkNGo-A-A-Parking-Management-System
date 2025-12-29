package com.parking.parkngo.mapper;
import com.parking.parkngo.dao.UserTypeDAO;
import com.parking.parkngo.dao.VehicleTypeDAO;
import com.parking.parkngo.dto.VehicleTypeDTO;
import com.parking.parkngo.entity.UserType;
import com.parking.parkngo.entity.VehicleType;

import java.time.LocalDateTime;

public class VehicleTypeMapper {

    public static VehicleTypeDTO convertToDTO(VehicleType vehicleType){
        VehicleTypeDTO vehicleTypeDTO = new VehicleTypeDTO();
        vehicleTypeDTO.setId(vehicleType.getId());
        vehicleTypeDTO.setName(vehicleType.getName());
        vehicleTypeDTO.setCode(vehicleType.getCode());
        vehicleTypeDTO.setActive(vehicleType.getActive());
        return vehicleTypeDTO;
    }

    public static VehicleType convertToEntity(VehicleTypeDAO vehicleTypeDAO){
        VehicleType vehicleType = new VehicleType();
        vehicleType.setName(vehicleTypeDAO.getName());
        vehicleType.setCode(vehicleTypeDAO.getCode());
        vehicleType.setActive(vehicleTypeDAO.getActive());
        return vehicleType;
    }

}