package com.example.carservice.controller;

import com.example.carservice.dto.request.CarRequestDto;
import com.example.carservice.dto.response.CarResponseDto;
import com.example.carservice.service.CarService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cars")
public class CarController {
    private final CarService carService ;
    public CarController(CarService carService){
        this.carService = carService ;
    }

    @PostMapping
    public ResponseEntity<CarResponseDto> createCar(@RequestBody CarRequestDto carRequestDto){
        CarResponseDto carResponseDto = carService.createCar(carRequestDto);
        return ResponseEntity.ok(carResponseDto);
    }
}