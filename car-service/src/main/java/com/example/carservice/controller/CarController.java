package com.example.carservice.controller;

import com.example.carservice.dto.request.CarRequestDto;
import com.example.carservice.dto.response.CarResponseDto;
import com.example.carservice.model.Car;
import com.example.carservice.service.CarService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @GetMapping
    public ResponseEntity<List<CarResponseDto>> getAllCars(){
        List<CarResponseDto> cars = carService.getCar();
        return ResponseEntity.ok(cars);
    }
}