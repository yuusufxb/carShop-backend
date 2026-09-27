package com.example.carservice.service;

import com.example.carservice.dto.request.CarRequestDto;
import com.example.carservice.dto.response.CarResponseDto;
import com.example.carservice.mapper.CarMapper;
import com.example.carservice.model.Car;
import com.example.carservice.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

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

    public List<CarResponseDto> getCar(){
            List<Car> cars = carRepository.findAll() ;
            return cars.stream().map(car -> CarMapper.carToDto(car)).toList();
    }

    public CarResponseDto getCarById(UUID id){
        Car car = carRepository.findById(id).orElseThrow(()-> new RuntimeException("Car not found!")) ;
        return CarMapper.carToDto(car);
    }

    public CarResponseDto updateCar(CarRequestDto carRequestDto , UUID id){
        Car oldCar = carRepository.findById(id).orElseThrow(()-> new RuntimeException("Car not found!")) ;
        Car newCar = CarMapper.updateCar(carRequestDto, oldCar);
        carRepository.save(newCar) ;
        return CarMapper.carToDto(newCar) ;
    }
    public void deleteCarById(UUID id){
        carRepository.findById(id).orElseThrow(()-> new RuntimeException("Car not found!")) ;
        carRepository.deleteById(id);
    }
}
