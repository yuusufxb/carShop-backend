package com.example.carservice.dto.response;

import com.example.carservice.Enum.FuelType;
import com.example.carservice.Enum.Transmission;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
public class CarResponseDto {
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

    private Transmission transmission ;

    private String licensePlate ;

    private FuelType fuelType ;

}
