package com.example.carservice.model;

import com.example.carservice.Enum.CarCondition;
import com.example.carservice.Enum.FuelType;
import com.example.carservice.Enum.Transmition;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
public class Car {
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

    private LocalDateTime createdAt ;

}
