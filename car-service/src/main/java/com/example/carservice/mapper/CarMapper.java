package com.example.carservice.mapper;

import com.example.carservice.dto.request.CarRequestDto;
import com.example.carservice.dto.response.CarResponseDto;
import com.example.carservice.model.Car;

public class CarMapper {
    public static Car dtoToCar(CarRequestDto carRequestDto){
        Car car = new Car();
        car.setCarCondition(carRequestDto.getCarCondition());
        car.setColor(carRequestDto.getColor());
        car.setPrice(carRequestDto.getPrice());
        car.setDoors(carRequestDto.getDoors());
        car.setFuelType(carRequestDto.getFuelType());
        car.setYear(carRequestDto.getYear());
        car.setDescription(carRequestDto.getDescription());
        car.setMileAge(carRequestDto.getMileAge());
        car.setModel(carRequestDto.getModel());
        car.setName(carRequestDto.getName());
        car.setSeats(carRequestDto.getSeats());
        car.setTransmission((carRequestDto.getTransmission()));
        return car;
    }
    public static CarResponseDto carToDto(Car car){
        CarResponseDto carResponseDto = new CarResponseDto();
        carResponseDto.setId(car.getId());
        carResponseDto.setCarCondition(car.getCarCondition());
        carResponseDto.setColor(car.getColor());
        carResponseDto.setPrice(car.getPrice());
        carResponseDto.setDoors(car.getDoors());
        carResponseDto.setFuelType(car.getFuelType());
        carResponseDto.setYear(car.getYear());
        carResponseDto.setDescription(car.getDescription());
        carResponseDto.setMileAge(car.getMileAge());
        carResponseDto.setModel(car.getModel());
        carResponseDto.setName(car.getName());
        carResponseDto.setSeats(car.getSeats());
        carResponseDto.setTransmission((car.getTransmission()));
        return carResponseDto;
    }
}
