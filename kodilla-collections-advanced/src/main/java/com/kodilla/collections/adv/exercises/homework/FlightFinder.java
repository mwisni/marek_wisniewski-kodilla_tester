package com.kodilla.collections.adv.exercises.homework;

import com.kodilla.collections.adv.exercises.dictionary.EnglishWord;

import java.util.*;

public class FlightFinder {

    List<Flight> flightList = new ArrayList<>();

    public List<Flight> findFlightFrom (String departure){
        List<Flight> flightsListFrom = new ArrayList<>();

        for (Flight flight: flightList) {
            if (flight.getDeparture().equals(departure))
                flightsListFrom.add(flight);
        }
        return flightsListFrom;
    }


    public List<Flight> findFlightTo (String arrival){
        List<Flight> flightListTo = new ArrayList<>();

        for (Flight flight: flightList){
            if (flight.getArrival().equals(arrival))
                flightListTo.add(flight);
        }
        return flightListTo;
    }

}
