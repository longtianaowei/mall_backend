package com.damaomao.mallbackend.controller;

import com.damaomao.mallbackend.pojo.Car;
import com.damaomao.mallbackend.pojo.ResultVo;
import com.damaomao.mallbackend.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/car")
public class CarController {
    @Autowired
    CarService carService;

    @PostMapping ("/add")
    public ResultVo addCar(@RequestBody Car car)
    {
        return carService.addCar(car);
    }

    @DeleteMapping("/del")
    public ResultVo delCar(@RequestParam("id") Integer id)
    {
        return carService.delCar(id);
    }

    @GetMapping("/query")
    public ResultVo queryCar(Integer userId)
    {
        return carService.queryCar(userId);
    }
}
