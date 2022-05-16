package ua.lviv.iot.lab2.model;

public abstract class AbstractHockeyEquipment {
    protected String name;
    protected double price;
    protected int size;
    protected TypeOfHockeyEquipment typeOfHockeyEquipment;

    public AbstractHockeyEquipment(String name, double price, int size,
                                   TypeOfHockeyEquipment typeOfHockeyEquipment) {
        this.name = name;
        this.price = price;
        this.size = size;
        this.typeOfHockeyEquipment = typeOfHockeyEquipment;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public TypeOfHockeyEquipment getTypeOfHockeyEquipment() {
        return typeOfHockeyEquipment;
    }

    public void setTypeOfHockeyEquipment(TypeOfHockeyEquipment
                                                 typeOfHockeyEquipment) {
        this.typeOfHockeyEquipment = typeOfHockeyEquipment;
    }

    public String getHeaders() {
        return "name, price, size, typeOfHockeyEquipment";
    }

    public String toCSV() {
        return name + "," + price + "," + size + "," + typeOfHockeyEquipment;
    }
}