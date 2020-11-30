package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTest {

    @Test
        public void testFindFlyFrom(){
        // gives
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> flightList = FlightRepository.getFlightsTable();
        flightList.add(new Flight("Warszawa", "aaa"));
        // when
        List<Flight> result = new ArrayList<>();
        result.add(new Flight("Warszawa", "Krakow"));
        // then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Warszawa", "Krakow"));
        assertEquals(expectedList, result);
        }

}
