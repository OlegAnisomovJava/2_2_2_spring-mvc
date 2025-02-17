package web.service;

import org.springframework.stereotype.Service;
import web.Model.Car;

import java.util.Arrays;
import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    private final List<Car> cars = Arrays.asList(
            new Car("Nissan", "350z", 2024),
            new Car("Toyota", "Tank", 2020),
            new Car("Lada", "Kalina", 2024),
            new Car("Kia", "Optima", 2015),
            new Car("BMW", "5-series", 2024));

    public List<Car> getCars(Integer count) {
        if (count == null || count >= cars.size()) {
            return cars;
        }
        return cars.subList(0, count);
    }

}

