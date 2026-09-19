package com.example.carservice.dto.response;

import com.example.carservice.Enum.CarCondition;
import com.example.carservice.Enum.FuelType;
import com.example.carservice.Enum.Transmition;
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

    private CarCondition carCondition ;

    private Transmition transmition ;

    private FuelType fuelType ;

}
