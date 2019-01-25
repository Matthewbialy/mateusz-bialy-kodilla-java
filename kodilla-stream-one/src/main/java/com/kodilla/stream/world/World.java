package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {

    private final List<Continent> theListOfContinents = new ArrayList<>();

    public void addContinents(Continent continent) {
        theListOfContinents.add(continent);
    }

    public BigDecimal getPeopleQuanity() {

        BigDecimal getPopulation = theListOfContinents.stream()
                .flatMap(c -> c.getTheListOfCountries().stream())
                .map(c -> c.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        return getPopulation;

    }
}


