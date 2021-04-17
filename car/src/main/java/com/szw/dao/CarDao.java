package com.szw.dao;

import com.szw.pojo.Car;

import java.util.List;

public interface CarDao {
    //添加一个车辆
    int addCar(Car car);

    //删除一个车辆
    int deleteCarById(Integer carid);

    //更新一个车辆
    int updateCar(Car car);

    //通过id查询
    Car findCarById(Integer carid);

    //查询所有车辆
    List<Car> queryAllCar();
}
