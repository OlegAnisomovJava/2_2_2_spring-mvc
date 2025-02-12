package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Model.Car;
import web.service.CarService;

import java.util.List;

@Controller
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String showVievCars(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        List<Car> cars = carService.getCars();
        if (count >= 5) {
            model.addAttribute("cars", cars);
        } else {
            model.addAttribute("cars", cars.subList(0, Math.min(count, cars.size())));
        }
        return "cars";
    }
}
