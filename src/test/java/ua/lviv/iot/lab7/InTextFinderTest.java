package ua.lviv.iot.lab7;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

import static org.junit.jupiter.api.Assertions.*;

class InTextFinderTest {
    @Test
    void InTextFinderTest(){
        InTextFinder f = new InTextFinder();
        f.main();
        try (BufferedReader reader = new BufferedReader(new FileReader("expected.txt"));
             BufferedReader reader2 = new BufferedReader(new FileReader("result.txt"))){
            String s = reader.readLine();
            boolean ok = true;
            while(s != null) {
                ok = (ok && s.equals(reader2.readLine()));
                s = reader.readLine();
            }
            assertEquals(ok, true);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}