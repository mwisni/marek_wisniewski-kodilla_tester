package com.kodilla.collections.adv.exercises.homework;

import java.util.*;

public class FlightRepository {

    public static List<Flight> getFlightsTable(){
        List<Flight> flightList = new ArrayList<>();
        flightList.add(new Flight("Warszawa", "Moskwa"));
        flightList.add(new Flight("Modlin", "London"));
        flightList.add(new Flight("Wroclaw", "NY"));

        return flightList;
    }


}
