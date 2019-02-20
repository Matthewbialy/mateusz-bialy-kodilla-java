package com.kodilla.patterns.factory.task;


public final class TaskFactory {

    public static final String SHOPPINGTASK = "SHOPPINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String DRIVINGTASK = "DRIVINGTASK";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPINGTASK:
                return new ShoppingTask("FirstTask", "Food", 4);
            case PAINTINGTASK:
                return new PaintingTask("SecoundTask", "Blue", "Car");
            case DRIVINGTASK:
                return new DrivingTask("ThirdTask", "London", "Car");
            default:
                return null;
        }
    }
}
