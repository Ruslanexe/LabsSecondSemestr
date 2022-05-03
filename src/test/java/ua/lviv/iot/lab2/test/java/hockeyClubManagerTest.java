package ua.lviv.iot.lab2.test.java;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.lab2.manager.hockeyClubManager;
import ua.lviv.iot.lab2.model.AbstractHockeyEquipment;
import ua.lviv.iot.lab2.model.hockeyArmor;
import ua.lviv.iot.lab2.model.hockeyStick;
import ua.lviv.iot.lab2.model.typeOfHockeyEquipment;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class hockeyClubManagerTest {
    List<hockeyArmor> hockeyArmor = new ArrayList<>();
    hockeyArmor forTheDefender = new hockeyArmor("BloodEagle", 1200, 12, typeOfHockeyEquipment.forTheDefender);
    List<hockeyStick> hockeyStick = new ArrayList<>();
    hockeyStick fotTheAttacker = new hockeyStick("StoneAge", 300, 10, typeOfHockeyEquipment.fotTheAttacker, "red");

    @Test
    void priceSortedByGrowth() {
        List<AbstractHockeyEquipment> list = new LinkedList<>();
        list.add(new hockeyArmor("BloodEagle", 1200, 12, typeOfHockeyEquipment.forTheDefender));
        list.add(new hockeyArmor("Ilysha", 300, 121, typeOfHockeyEquipment.fotTheAttacker));
        list.add(new hockeyArmor("Antosha", 9000, 126, typeOfHockeyEquipment.fotTheAttacker));
        list.add(new hockeyArmor("Ylyasha", 20012, 1271, typeOfHockeyEquipment.forTheReferee));
        list.add(new hockeyArmor("Bogdasha", 56, 1261, typeOfHockeyEquipment.fotTheAttacker));
        hockeyClubManager manager = new hockeyClubManager(list);
        List<AbstractHockeyEquipment> sortedbyprice = manager.SortedByGrowth();
        for (int i = 1; i < sortedbyprice.size(); i++) {
            if (sortedbyprice.get(i).getPrice() < sortedbyprice.get(i - 1).getPrice())
                fail("pizdez");

        }


    }

    @Test
    void getSortedByDescending() {
        List<AbstractHockeyEquipment> list = new LinkedList<>();
        list.add(new hockeyArmor("BloodEagle", 1200, 12, typeOfHockeyEquipment.forTheDefender));
        list.add(new hockeyArmor("Ilysha", 300, 121, typeOfHockeyEquipment.fotTheAttacker));
        list.add(new hockeyArmor("Antosha", 9000, 126, typeOfHockeyEquipment.fotTheAttacker));
        list.add(new hockeyArmor("Ylyasha", 20012, 1271, typeOfHockeyEquipment.forTheReferee));
        list.add(new hockeyArmor("Bogdasha", 56, 1261, typeOfHockeyEquipment.fotTheAttacker));
        hockeyClubManager manager = new hockeyClubManager(list);
        List<AbstractHockeyEquipment> sortedbyprice = manager.getSortedByDescending();
        for (int i = 1; i < sortedbyprice.size(); i++) {
            if (sortedbyprice.get(i).getPrice() > sortedbyprice.get(i - 1).getPrice())
                fail("pizdez2.0");

        }
    }
    @Test
    void sortByGrowthAlphabet() {
        List<AbstractHockeyEquipment> list = new LinkedList<>();
        list.add(new hockeyArmor("BloodEagle", 1200, 12, typeOfHockeyEquipment.forTheDefender));
        list.add(new hockeyArmor("Ilysha", 300, 121, typeOfHockeyEquipment.fotTheAttacker));
        list.add(new hockeyArmor("Antosha", 9000, 126, typeOfHockeyEquipment.fotTheAttacker));
        list.add(new hockeyArmor("Ylyasha", 20012, 1271, typeOfHockeyEquipment.forTheReferee));
        list.add(new hockeyArmor("Bogdasha", 56, 1261, typeOfHockeyEquipment.fotTheAttacker));
        hockeyClubManager manager = new hockeyClubManager(list);
        List<AbstractHockeyEquipment> sortedbyname = manager.sortByGrowthAlphabet();
        for (int i = 1; i < sortedbyname.size(); i++) {
            if (sortedbyname.get(i).getName().compareTo(sortedbyname.get(i - 1).getName())<1 )
                fail("pizdez2.0");
        }

    }
    @Test
    void sortByDescendingAlphabet() {
        List<AbstractHockeyEquipment> list = new LinkedList<>();
        list.add(new hockeyArmor("BloodEagle", 1200, 12, typeOfHockeyEquipment.forTheDefender));
        list.add(new hockeyArmor("Ilysha", 300, 121, typeOfHockeyEquipment.fotTheAttacker));
        list.add(new hockeyArmor("Antosha", 9000, 126, typeOfHockeyEquipment.fotTheAttacker));
        list.add(new hockeyArmor("Ylyasha", 20012, 1271, typeOfHockeyEquipment.forTheReferee));
        list.add(new hockeyArmor("Bogdasha", 56, 1261, typeOfHockeyEquipment.fotTheAttacker));
        hockeyClubManager manager = new hockeyClubManager(list);
        List<AbstractHockeyEquipment> sortedbyname = manager.sortByDescendingAlphabet();
        for (int i = 1; i < sortedbyname.size(); i++) {
            if (sortedbyname.get(i).getName().compareTo(sortedbyname.get(i - 1).getName()) > -1)
                fail("pizdez2.0");
        }
    }
    @Test
    void findByPrice(){
        List<AbstractHockeyEquipment> list = new LinkedList<>();
        list.add(new hockeyArmor("BloodEagle", 1200, 12, typeOfHockeyEquipment.forTheDefender));
        list.add(new hockeyArmor("Ilysha", 300, 121, typeOfHockeyEquipment.fotTheAttacker));
        list.add(new hockeyArmor("Antosha", 9000, 126, typeOfHockeyEquipment.fotTheAttacker));
        list.add(new hockeyArmor("Ylyasha", 20012, 1271, typeOfHockeyEquipment.forTheReferee));
        list.add(new hockeyArmor("Bogdasha", 56, 1261, typeOfHockeyEquipment.fotTheAttacker));
        hockeyClubManager manager = new hockeyClubManager(list);
        List<AbstractHockeyEquipment> findByPrice = manager.findByPrice(9000);
        for (int i=0;i<list.size();i++){
            if (list.get(i).getPrice()==9000 && findByPrice.contains(list.get(i))==false)
                fail("Hate programming");
            if (list.get(i).getPrice()!=9000 && findByPrice.contains(list.get(i))==true)
                fail("Hate programming");
        }
    }
}