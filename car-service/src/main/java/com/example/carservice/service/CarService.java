package com.example.carservice.service;

import com.example.carservice.dto.request.CarRequestDto;
import com.example.carservice.dto.response.CarResponseDto;
import com.example.carservice.mapper.CarMapper;
import com.example.carservice.model.Car;
import com.example.carservice.repository.CarRepository;
import org.springframework.stereotype.Service;

@Service
public class CarService {
    private CarRepository carRepository;
    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }
    public CarResponseDto createCar(CarRequestDto carRequestDto){
        Car createdCar = carRepository.save(CarMapper.dtoToCar(carRequestDto));
        return CarMapper.carToDto(createdCar);
    }
}
