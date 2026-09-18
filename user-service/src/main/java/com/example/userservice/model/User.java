package com.example.userservice.model;

import com.example.userservice.Enum.CarCondition;
import com.example.userservice.Enum.FuelType;
import com.example.userservice.Enum.Transmition;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name ;

    private String model ;

    private Integer year ;

    private  Integer mileAge ;

    private Integer doors ;

    private Integer seats ;

    private BigDecimal price ;

    private String Color ;

    private String description ;

    @Enumerated(EnumType.STRING)
    private CarCondition carCondition ;

    @Enumerated(EnumType.STRING)
    private Transmition transmition ;

    @Enumerated(EnumType.STRING)
    private FuelType fuelType ;

}
