package com.kodilla.stream.invoice.simple;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public final class SimpleInvoice {

    private final List<Simpleitem> items = new ArrayList<>();

    public void addItem(Simpleitem item) {
        items.add(item);
    }

    public boolean removeItem(Simpleitem item) {
        return items.remove(item);

    }

    public double getValueToPay() {
        return items.stream()
                .collect(Collectors.summingDouble(Simpleitem::getValue));
    }
}
