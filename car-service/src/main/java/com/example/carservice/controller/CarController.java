package com.example.carservice.controller;

import com.example.carservice.dto.request.CarRequestDto;
import com.example.carservice.dto.response.CarResponseDto;
import com.example.carservice.model.Car;
import com.example.carservice.service.CarService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@CrossOrigin(origins = "http://localhost:5173")
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
    @GetMapping("/{id}")
    public ResponseEntity<CarResponseDto> getCarById(@PathVariable UUID id){
        CarResponseDto carResponseDto = carService.getCarById(id) ;
        return ResponseEntity.ok(carResponseDto);
    }
    @PutMapping("{id}")
    public ResponseEntity<CarResponseDto> updateCar(@RequestBody CarRequestDto carRequestDto , @PathVariable UUID id){
        CarResponseDto carResponseDto = carService.updateCar(carRequestDto , id);
        return ResponseEntity.ok(carResponseDto);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCarById(@PathVariable UUID id){
        carService.deleteCarById(id);
        return ResponseEntity.ok("Car deleted!") ;
    }
}