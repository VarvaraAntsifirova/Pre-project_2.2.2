package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> getFullListOfCar();

    List<Car> getListOfCar(int count, List<Car> fullList);
}
