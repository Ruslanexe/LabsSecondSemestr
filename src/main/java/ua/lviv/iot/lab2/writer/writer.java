package ua.lviv.iot.lab2.writer;

import ua.lviv.iot.lab2.model.AbstractHockeyEquipment;

import java.io.FileWriter;
import java.util.List;

public class writer {
    public void writeToFile(List<AbstractHockeyEquipment> list) {
        try (FileWriter writer = new FileWriter("result.csv")) {
            writer.write(list.get(0).getHeaders() + "\r\n");
            for (AbstractHockeyEquipment m : list) {
                writer.write(m.toCSV() + "\r\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

