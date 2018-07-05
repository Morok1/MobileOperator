package stubs;

import model.Rate;

import java.util.ArrayList;
import java.util.List;

public class RateStub {
    public RateStub() {
    }

    public List<Rate> init() {
        Rate rate = new Rate();
        Rate rate1 = new Rate();
        String name = "Vasya";
        String name1 = "Petya";
        rate.setName(name);
        rate1.setCost(54.);
        rate1.setCost(345.);
        rate1.setName(name1);
        List<Rate> rateList = new ArrayList<>();
        rateList.add(rate);
        rateList.add(rate1);
        return rateList;
    }
}
