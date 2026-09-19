package com.example.carservice.dto.request;


import com.example.carservice.Enum.CarCondition;
import com.example.carservice.Enum.FuelType;
import com.example.carservice.Enum.Transmition;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import java.math.BigDecimal;

@Getter
@Setter
public class CarRequestDto {
    @NotBlank(message = "name is required")
    private String name ;

    @NotBlank(message = "model is required")
    private String model ;

    @NotNull(message = "year is required")
    @Min(1899)
    @Max(2028)
    private Integer year ;

    @NotNull(message = "mile age is required")
    @Min(0)
    private  Integer mileAge ;

    @NotNull(message = "doors number is required")
    private Integer doors ;

    @NotNull(message = "number of seats is required")
    private Integer seats ;

    @NotNull(message = "price is required is required")
    private BigDecimal price ;

    @NotBlank(message = "color is required")
    private String Color ;

    @Length(max = 150)
    private String description ;

    @NotNull
    private CarCondition carCondition ;

    @NotNull
    private Transmition transmition ;

    @NotNull
    private FuelType fuelType ;
}
