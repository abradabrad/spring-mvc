package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarService {

    private List<Car> carList = new ArrayList<>();

    public CarService() {
        carList.add(new Car(1999, "NIVA 21213", 1));
        carList.add(new Car(2006, "Hyundai  Getz", 2));
        carList.add(new Car(1970, "IFA W50", 3));
        carList.add(new Car(1991, "Mitsubishi Delica", 4));
        carList.add(new Car(2008, "Suzuki SX4", 5));
        carList.add(new Car(2020, "Renault Kaptur", 6));

    }

    public List<Car> getCarList(int count) {
        if ((count == 0) || (count >= 5)) {
            count = carList.size();
        }
        return carList.subList(0, count);
    }
}