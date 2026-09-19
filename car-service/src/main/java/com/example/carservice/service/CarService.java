package com.example.carservice.service;

import com.example.carservice.repository.CarRepository;
import org.springframework.stereotype.Service;

@Service
public class CarService {
    private CarRepository carRepository;
    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }
}
