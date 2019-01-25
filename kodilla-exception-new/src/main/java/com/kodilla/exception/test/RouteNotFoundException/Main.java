package com.kodilla.exception.test.RouteNotFoundException;

import java.util.HashMap;

public class Main extends LogicAirport {

    public static void main(String[] args) {

        LogicAirport logicAirport = new LogicAirport();
        Boolean result = false;
        try {
            result = logicAirport.findFlight(new Flight("Heathrow", "Heathrow"));
        } catch (RouteNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(result);

    }
}
