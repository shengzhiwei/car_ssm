package com.szw.service.Impl;

import com.szw.dao.CarDao;
import com.szw.pojo.Car;
import com.szw.service.CarService;

import java.util.List;

public class CarServiceImpl implements CarService {
    private CarDao carDao;

    public void setCarDao(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public int addCar(Car car) {
        return carDao.addCar(car);
    }

    @Override
    public int deleteCarById(Integer carid) {
        return carDao.deleteCarById(carid);
    }

    @Override
    public int updateCar(Car car) {
        return carDao.updateCar(car);
    }

    @Override
    public Car findCarById(Integer carid) {
        return carDao.findCarById(carid);
    }

    @Override
    public List<Car> queryAllCar() {
        return carDao.queryAllCar();
    }
}
