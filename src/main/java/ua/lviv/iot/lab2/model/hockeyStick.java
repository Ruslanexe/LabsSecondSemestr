package ua.lviv.iot.lab2.model;

public class hockeyStick extends AbstractHockeyEquipment {
    private String colour;

    public hockeyStick(String name, double price, int size, typeOfHockeyEquipment typeOfHockeyEquipment, String colour) {
        super(name, price, size, typeOfHockeyEquipment);
        this.colour = colour;

    }
}

