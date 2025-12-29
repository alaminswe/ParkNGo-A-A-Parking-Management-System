package com.parking.parkngo.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "pm_user_type")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "name")
    String name;

    @Column(name = "code")
    String code;

    @Column(name = "active")
    Boolean active;

    //
    @Column(name = "created_by")
    String createdBy;

    @Column(name = "created_at")
    LocalDateTime createdAt;


    @Column(name = "updated_by")
    String updatedBy;

    @Column(name = "updated_at")
    LocalDateTime updatedAt;

}
