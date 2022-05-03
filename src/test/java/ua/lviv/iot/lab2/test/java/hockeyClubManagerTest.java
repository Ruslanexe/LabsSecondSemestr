package ua.lviv.iot.lab2.test.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import ua.lviv.iot.lab2.manager.HockeyClubManager;
import ua.lviv.iot.lab2.model.AbstractHockeyEquipment;
import ua.lviv.iot.lab2.model.HockeyArmor;
import ua.lviv.iot.lab2.model.HockeyArmor;
import ua.lviv.iot.lab2.model.HockeyStick;
import ua.lviv.iot.lab2.model.TypeOfHockeyEquipment;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class hockeyClubManagerTest {
    List<HockeyArmor> hockeyArmor = new ArrayList<>();
    HockeyArmor forTheDefender = new HockeyArmor("BloodEagle", 1200, 12, TypeOfHockeyEquipment.forTheDefender);
    List<HockeyStick> hockeyStick = new ArrayList<>();
    HockeyStick fotTheAttacker = new HockeyStick("StoneAge", 300, 10, TypeOfHockeyEquipment.fotTheAttacker, "red");

    @Test
    void priceSortedByGrowth() {
        List<AbstractHockeyEquipment> list = new LinkedList<>();
        list.add(new HockeyArmor("BloodEagle", 1200, 12, TypeOfHockeyEquipment.forTheDefender));
        list.add(new HockeyArmor("Ilysha", 300, 121, TypeOfHockeyEquipment.fotTheAttacker));
        list.add(new HockeyArmor("Antosha", 9000, 126, TypeOfHockeyEquipment.fotTheAttacker));
        list.add(new HockeyArmor("Ylyasha", 20012, 1271, TypeOfHockeyEquipment.forTheReferee));
        list.add(new HockeyArmor("Bogdasha", 56, 1261, TypeOfHockeyEquipment.fotTheAttacker));
        HockeyClubManager manager = new HockeyClubManager(list);
        List<AbstractHockeyEquipment> sortedbyprice = manager.sortedByGrowth();
        for (int i = 1; i < sortedbyprice.size(); i++) {
            if (sortedbyprice.get(i).getPrice() < sortedbyprice.get(i - 1).getPrice())
                fail("pizdez");

        }


    }

    @Test
    void getSortedByDescending() {
        List<AbstractHockeyEquipment> list = new LinkedList<>();
        list.add(new HockeyArmor("BloodEagle", 1200, 12, TypeOfHockeyEquipment.forTheDefender));
        list.add(new HockeyArmor("Ilysha", 300, 121, TypeOfHockeyEquipment.fotTheAttacker));
        list.add(new HockeyArmor("Antosha", 9000, 126, TypeOfHockeyEquipment.fotTheAttacker));
        list.add(new HockeyArmor("Ylyasha", 20012, 1271, TypeOfHockeyEquipment.forTheReferee));
        list.add(new HockeyArmor("Bogdasha", 56, 1261, TypeOfHockeyEquipment.fotTheAttacker));
        HockeyClubManager manager = new HockeyClubManager(list);
        List<AbstractHockeyEquipment> sortedbyprice = manager.getSortedByDescending();
        for (int i = 1; i < sortedbyprice.size(); i++) {
            if (sortedbyprice.get(i).getPrice() > sortedbyprice.get(i - 1).getPrice())
                fail("pizdez2.0");

        }
    }

    @Test
    void sortByGrowthAlphabet() {
        List<AbstractHockeyEquipment> list = new LinkedList<>();
        list.add(new HockeyArmor("BloodEagle", 1200, 12, TypeOfHockeyEquipment.forTheDefender));
        list.add(new HockeyArmor("Ilysha", 300, 121, TypeOfHockeyEquipment.fotTheAttacker));
        list.add(new HockeyArmor("Antosha", 9000, 126, TypeOfHockeyEquipment.fotTheAttacker));
        list.add(new HockeyArmor("Ylyasha", 20012, 1271, TypeOfHockeyEquipment.forTheReferee));
        list.add(new HockeyArmor("Bogdasha", 56, 1261, TypeOfHockeyEquipment.fotTheAttacker));
        HockeyClubManager manager = new HockeyClubManager(list);
        List<AbstractHockeyEquipment> sortedbyname = manager.sortByGrowthAlphabet();
        for (int i = 1; i < sortedbyname.size(); i++) {
            if (sortedbyname.get(i).getName().compareTo(sortedbyname.get(i - 1).getName()) < 1)
                fail("pizdez2.0");
        }

    }

    @Test
    void sortByDescendingAlphabet() {
        List<AbstractHockeyEquipment> list = new LinkedList<>();
        list.add(new HockeyArmor("BloodEagle", 1200, 12, TypeOfHockeyEquipment.forTheDefender));
        list.add(new HockeyArmor("Ilysha", 300, 121, TypeOfHockeyEquipment.fotTheAttacker));
        list.add(new HockeyArmor("Antosha", 9000, 126, TypeOfHockeyEquipment.fotTheAttacker));
        list.add(new HockeyArmor("Ylyasha", 20012, 1271, TypeOfHockeyEquipment.forTheReferee));
        list.add(new HockeyArmor("Bogdasha", 56, 1261, TypeOfHockeyEquipment.fotTheAttacker));
        HockeyClubManager manager = new HockeyClubManager(list);
        List<AbstractHockeyEquipment> sortedbyname = manager.sortByDescendingAlphabet();
        for (int i = 1; i < sortedbyname.size(); i++) {
            if (sortedbyname.get(i).getName().compareTo(sortedbyname.get(i - 1).getName()) > -1)
                fail("pizdez2.0");
        }
    }

    @Test
    void findByPrice() {
        List<AbstractHockeyEquipment> list = new LinkedList<>();
        list.add(new HockeyArmor("BloodEagle", 1200, 12, TypeOfHockeyEquipment.forTheDefender));
        list.add(new HockeyArmor("Ilysha", 300, 121, TypeOfHockeyEquipment.fotTheAttacker));
        list.add(new HockeyArmor("Antosha", 9000, 126, TypeOfHockeyEquipment.fotTheAttacker));
        list.add(new HockeyArmor("Ylyasha", 20012, 1271, TypeOfHockeyEquipment.forTheReferee));
        list.add(new HockeyArmor("Bogdasha", 56, 1261, TypeOfHockeyEquipment.fotTheAttacker));
        HockeyClubManager manager = new HockeyClubManager(list);
        List<AbstractHockeyEquipment> findByPrice = manager.findByPrice(9000);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPrice() == 9000 && findByPrice.contains(list.get(i)) == false)
                fail("Hate programming");
            if (list.get(i).getPrice() != 9000 && findByPrice.contains(list.get(i)) == true)
                fail("Hate programming");
        }
    }
}