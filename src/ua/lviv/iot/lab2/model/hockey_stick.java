package ua.lviv.iot.lab2.model;

import ua.lviv.iot.lab2.manager.AbstractHockeyEquipment;

public class hockey_stick extends AbstractHockeyEquipment {
    private String colour;

    public hockey_stick(String name, double price, int size, typeOfHockeyEquipment typeOfHockeyEquipment, String colour) {
        super(name, price, size, typeOfHockeyEquipment);
        this.colour = colour;

    }
}

