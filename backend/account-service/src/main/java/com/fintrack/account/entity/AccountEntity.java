package com.fintrack.account.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
public class AccountEntity {

    @Id
    private UUID id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String code;

    @Column(nullable = false)
    private String type; // ex: ASSET, LIABILITY...

    @Column
    private UUID parentId;

    // Getters and Setters
}
