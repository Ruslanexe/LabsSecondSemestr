package ua.lviv.iot.lab2.writer;

import org.junit.jupiter.api.Test;
import ua.lviv.iot.lab2.model.AbstractHockeyEquipment;
import ua.lviv.iot.lab2.model.HockeyArmor;
import ua.lviv.iot.lab2.model.HockeyArmor;
import ua.lviv.iot.lab2.model.TypeOfHockeyEquipment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class writerTest {
    @Test
    void testWriteToFile() {
        writer hck = new writer();
        List<AbstractHockeyEquipment> list = new LinkedList<>();
        list.add(new HockeyArmor("BloodEagle", 1200, 12, TypeOfHockeyEquipment.forTheDefender));
        list.add(new HockeyArmor("Ilysha", 300, 121, TypeOfHockeyEquipment.fotTheAttacker));
        list.add(new HockeyArmor("Antosha", 9000, 126, TypeOfHockeyEquipment.fotTheAttacker));
        list.add(new HockeyArmor("Ylyasha", 20012, 1271, TypeOfHockeyEquipment.forTheReferee));
        list.add(new HockeyArmor("Bogdasha", 56, 1261, TypeOfHockeyEquipment.fotTheAttacker));
        hck.writeToFile(list);
        try (
                FileReader expectedFR = new FileReader("expected.csv");
                BufferedReader expectedBR = new BufferedReader(expectedFR);
                FileReader actualFR = new FileReader("result.csv");
                BufferedReader actualBR = new BufferedReader(actualFR);
        ) {
            assertEquals(expectedBR.readLine(), actualBR.readLine());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

