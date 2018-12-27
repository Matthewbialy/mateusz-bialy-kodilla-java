package com.kodilla.stream.beautifier;



public class PoemBeautifier {

    public void beautify() {

    String beautify = "This is text to beautify";
    String actualValue = beautify.toUpperCase();
    System.out.println(actualValue);

    String beautify1 = "This is Text to Change on LowerCase method...";
    String actualValue1 = beautify1.toLowerCase();
    System.out.println(actualValue1);

    String beautify2 = "This is another text to change !!!";
    String actualValue2 = beautify2.substring(10);
    System.out.println(actualValue2);


    }
}
