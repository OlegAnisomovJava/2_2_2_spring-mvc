package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Model.Car;
import web.service.CarServiceImpl;

import java.util.List;

@Controller
public class CarController {

    private CarServiceImpl carServiceImpl;

    @Autowired
    public void setCarService(CarServiceImpl carServiceImpl) {
        this.carServiceImpl = carServiceImpl;
    }

    @GetMapping("/cars")
    public String getCars(@RequestParam(value = "count", required = false) Integer count, Model model) {
        List<Car> cars = carServiceImpl.getCars(count);
        model.addAttribute("cars", cars);
        return "cars";
    }

}
