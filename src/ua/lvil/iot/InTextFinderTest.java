package ua.lvil.iot;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class InTextFinderTest {
    @Test
    void FindInText() {
        String[] expected = {"Lorem ipsum do-lor sit am-et!", "Duis aute irure dol-or in repre-henderit!"};
        InTextFinder finder = new InTextFinder();
        List<String> filesList = finder.expected("Lorem ipsum do-lor sit am-et! consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dol-or in repre-henderit! in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
        try {
            for (int i = 0; i < expected.length; i++) {
                assertEquals(expected[i], filesList.get(i));
                System.out.println(filesList.get(i));
            }
        } catch (Exception e) {
            System.out.println("Exeption: " + e);
        }
    }
}
