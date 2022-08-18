package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarsService {


    public List<Car> getCars (int qty) {
        List<Car> cars = List.of (
                new Car("BMW", "330", 2006),
                new Car("Mercedes-Benz", "C43AMG", 2019),
                new Car("Lotus", "Elise", 2003),
                new Car("Audi", "RS6", 2022),
                new Car("Toyota", "Supra A90", 2020)
        );

        if (qty < 5) {
            return cars.stream().limit(qty).collect(Collectors.toList());
        } else {
            return cars;
        }
    }
}
