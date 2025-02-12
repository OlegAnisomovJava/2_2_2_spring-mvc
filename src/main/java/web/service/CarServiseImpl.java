package web.service;

import org.springframework.stereotype.Service;
import web.Model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiseImpl implements CarService{

//    private List<Car> cars;

    @Override
    public List<Car> getCars() {
        List<Car> cars = new ArrayList<Car>();
        cars.add(new Car("Nissan", "350z", 2024));
        cars.add(new Car("Toyota", "Tank", 2020));
        cars.add(new Car("Lada", "Kalina", 2024));
        cars.add(new Car("Kia", "Optima", 2015));
        cars.add(new Car("BMW", "5-series", 2024));
        return cars;
    }
}
