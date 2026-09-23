package com.example.carservice.model;

import com.example.carservice.Enum.CarCondition;
import com.example.carservice.Enum.FuelType;
import com.example.carservice.Enum.Transmission;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;


@Data
@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name ;

    private String model ;

    @Column(name = "car_year")
    private Integer year ;

    private  Integer mileAge ;

    private Integer doors ;

    private Integer seats ;

    private BigDecimal price ;

    private String color ;

    private String description ;

    @Enumerated(EnumType.STRING)
    private CarCondition carCondition ;

    @Enumerated(EnumType.STRING)
    private Transmission transmission ;

    @Enumerated(EnumType.STRING)
    private FuelType fuelType ;

    private LocalDateTime createdAt ;

}
