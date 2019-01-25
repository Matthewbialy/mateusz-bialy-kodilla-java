package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {

        //Given
        List<Continent> theListOfContinents = new ArrayList<>();

        Continent europe = new Continent("Europe");
        europe.addListOfCountries(new Country("Poland", new BigDecimal("48000000")));
        europe.addListOfCountries(new Country("Spain", new BigDecimal("36000000")));

        Continent asia = new Continent("Asia");
        asia.addListOfCountries(new Country("Thailand", new BigDecimal("342000000")));
        asia.addListOfCountries(new Country("Philipines", new BigDecimal("2200000")));

        Continent afirca = new Continent("Africa");
        afirca.addListOfCountries(new Country("Zanzibar", new BigDecimal("2000001")));
        afirca.addListOfCountries(new Country("Madagaskar", new BigDecimal("2300000")));

        Continent bothAmetica = new Continent("America Nord and South");
        bothAmetica.addListOfCountries(new Country("Mexico", new BigDecimal("4320000000")));
        bothAmetica.addListOfCountries(new Country("USA", new BigDecimal("554000000")));
        bothAmetica.addListOfCountries(new Country("Brasil", new BigDecimal("76000000")));

        Continent australia = new Continent("Australia");
        australia.addListOfCountries(new Country("New Zeland", new BigDecimal("890000")));
        australia.addListOfCountries(new Country("Fidzi", new BigDecimal("760000")));


        //When
        World world = new World();
        world.addContinents(europe);
        world.addContinents(asia);
        world.addContinents(afirca);
        world.addContinents(bothAmetica);
        world.addContinents(australia);
        BigDecimal totalPeople = world.getPeopleQuanity();

        //Then
        BigDecimal expectedPeople = new BigDecimal("5384150001");
        Assert.assertEquals(expectedPeople, totalPeople);

    }
}
