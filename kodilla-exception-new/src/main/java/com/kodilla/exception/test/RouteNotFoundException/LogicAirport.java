package com.kodilla.exception.test.RouteNotFoundException;


import java.util.HashMap;

public class LogicAirport {

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        HashMap<String, Boolean> flights = new HashMap<>();
        flights.put("DeGole", true);
        flights.put("Chopin Airport", true);
        flights.put("Atlanta Airport", false);
        flights.put("Wrocław- Starachowice", true);

        System.out.println("Departure" +  flight.getDepartureAirport() + "Arrivals:" + flight.getArrivalAirport());

        if (flights.containsKey(flight.getArrivalAirport())){
            System.out.println("There is a flight on this destination");


            return flights.get(flight.getArrivalAirport());

        } else {
            throw new RouteNotFoundException();
        }
    }
}
