package com.example.carservice.controller;

import com.example.carservice.service.CarService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {
    private CarService carService ;
    public CarController(CarService carService){
        this.carService = carService ;
    }

}