package ua.lviv.iot.lab2;

import ua.lviv.iot.lab2.model.AbstractHockeyEquipment;
import ua.lviv.iot.lab2.manager.hockeyClubManager;
import ua.lviv.iot.lab2.model.hockeyArmor;
import ua.lviv.iot.lab2.model.hockeyStick;
import ua.lviv.iot.lab2.model.typeOfHockeyEquipment;

import java.util.LinkedList;
import java.util.List;

public  class Main {

    public static void main(String[] args) {
    hockeyStick Hockey_stick =new hockeyStick("BloodEagle",1200,3,typeOfHockeyEquipment.fotTheAttacker,"black");
    hockeyArmor Hockey_armor = new hockeyArmor("StoneField",3000,12,typeOfHockeyEquipment.forTheReferee);
    List<AbstractHockeyEquipment> list = new LinkedList<>();
    list.add(Hockey_stick);
    list.add(Hockey_armor);
    hockeyClubManager manager = new hockeyClubManager(list);
    System.out.println(manager.SortedByGrowth().get(0).getPrice());
    System.out.println(manager.SortedByGrowth().get(1).getPrice());
        System.out.println("ᓚᘏᗢᓚᘏᗢᓚᘏᗢᓚᘏᗢᓚᘏᗢᓚᘏᗢᓚᘏᗢᓚᘏᗢᓚᘏᗢᓚᘏᗢᓚᘏᗢᓚᘏᗢ");

    System.out.println(manager.getSortedByDescending().get(0).getPrice());
    System.out.println(manager.getSortedByDescending().get(1).getPrice());
        System.out.println("ᓚᘏᗢᓚᘏᗢᓚᘏᗢᓚᘏᗢᓚᘏᗢᓚᘏᗢᓚᘏᗢᓚᘏᗢᓚᘏᗢᓚᘏᗢᓚᘏᗢᓚᘏᗢ");

    System.out.println(manager.sortByGrowthAlphabet().get(0).getName());
    System.out.println(manager.sortByGrowthAlphabet().get(1).getName());
    System.out.println("ᓚᘏᗢᓚᘏᗢᓚᘏᗢᓚᘏᗢᓚᘏᗢᓚᘏᗢᓚᘏᗢᓚᘏᗢᓚᘏᗢᓚᘏᗢᓚᘏᗢᓚᘏᗢ");

        System.out.println(manager.sortByDescendingAlphabet().get(0).getName());
        System.out.println(manager.sortByDescendingAlphabet().get(1).getName());
        System.out.println("ᓚᘏᗢᓚᘏᗢᓚᘏᗢᓚᘏᗢᓚᘏᗢᓚᘏᗢᓚᘏᗢᓚᘏᗢᓚᘏᗢᓚᘏᗢᓚᘏᗢᓚᘏᗢ");
        System.out.println();
    System.out.println(manager.findByPrice(1200).get(0).getPrice());

    }
}
