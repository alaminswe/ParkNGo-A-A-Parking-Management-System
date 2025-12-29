package com.parking.parkngo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "pm_vehicle_type")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
//@NamedStoredProcedureQuery(
//        name = "pm_vehicle_type", procedureName = "pm_vehicle_type",
//        parameters = {
//                @StoredProcedureParameter(mode = ParameterMode.IN,name = "id",type = Long.class),
//                @StoredProcedureParameter(mode = ParameterMode.IN,name = "code",type = String.class),
//                @StoredProcedureParameter(mode = ParameterMode.IN,name = "name",type = String.class),
//                @StoredProcedureParameter(mode = ParameterMode.IN,name = "active",type = Boolean.class),
//                @StoredProcedureParameter(mode = ParameterMode.IN,name = "user",type = String.class),
//                @StoredProcedureParameter(mode = ParameterMode.IN,name = "operation",type = String.class),
//                @StoredProcedureParameter(mode = ParameterMode.OUT,name = "out_id",type = Long.class),
//                @StoredProcedureParameter(mode = ParameterMode.OUT,name = "out_message_code",type = Integer.class),
//                @StoredProcedureParameter(mode = ParameterMode.OUT,name = "out_message_description",type = String.class)
//        }
//)
public class VehicleType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "name")
    String name;

    @Column(name = "code")
    String code;

    @Column(name = "active")
    Boolean active;
    //next 4 ta create korte hobe;
    @Column(name = "created_by")
    String createdBy;

    @Column(name = "created_at")
    LocalDateTime createdAt;

    @Column(name = "updated_by")
    String updatedBy;

    @Column(name = "updated_at")
    LocalDateTime updatedAt;

}