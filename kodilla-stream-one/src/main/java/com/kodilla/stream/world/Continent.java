package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class Continent {

private final String nameOfContinents;


   public Continent(final String nameOfContinents) {
   this.nameOfContinents = nameOfContinents;

}

   public String getNameOfContinents() {
      return nameOfContinents;
   }

   private final List<Country> theListOfCountries = new ArrayList<>();

   public List<Country> getTheListOfCountries() {
      return theListOfCountries;
   }

   public void addListOfCountries(Country country) {
      theListOfCountries.add(country);
   }

   public static BigDecimal getPeopleQuanity() {
      return getPeopleQuanity();
   }


}

