package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class Country {

    private final String nameOfCountry;
    private final BigDecimal peopleQuantity;


    public Country(final String nameOfCountry, final BigDecimal peopleQuantity) {
        this.nameOfCountry = nameOfCountry;
        this.peopleQuantity = peopleQuantity;

    }

    public String getNameOfCountry() {
        return nameOfCountry;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }

}
