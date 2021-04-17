package com.szw.controller;

import com.szw.pojo.Car;
import com.szw.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/car")
public class CarController {
    @Autowired
    @Qualifier("carServiceImpl")
    private CarService carService;

    //展示所有车辆
    @RequestMapping("/allCar")
    public String list(Model model) {
        List<Car> cars = carService.queryAllCar();
        model.addAttribute("cars", cars);
        return "allCar";
    }

    //添加车辆
    @RequestMapping("/toaddCar")
    public String toaddCar() {
        return "addCar";
    }

    @RequestMapping("/addCar")
    public String addCar(Car car) {
        carService.addCar(car);
        return "redirect:/car/allCar";
    }


    // 删除用户，使用Restful风格
    @RequestMapping("/deleteCar/{carid}")
    public String deleteCar(@PathVariable("carid") Integer carid) {
        carService.deleteCarById(carid);
        return "redirect:/car/allCar";
    }

    //更改车辆
    @RequestMapping("/toUpdateCar")
    public String toUpdateCar(Integer carid, Model model) {
        Car car = carService.findCarById(carid);
        model.addAttribute("car",car);
        return "updateCar";
    }

    @RequestMapping("/updateCar")
    public String updateCar(Car car,Model model){
        carService.updateCar(car);
        carService.findCarById(car.getCarid());
        model.addAttribute("car",car);
        return "redirect:/car/allCar";
    }

}
