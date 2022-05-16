package ua.lviv.iot.lab7;


import java.io.FileWriter;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InTextFinder {
        public static void main() {
            final String regex = "[^?.!]*[^?.!]+-[^?.!]+\\s[^?.!,-]+\\s[^?.!]+-[^?.!]+[^?.!]*!";
            final String string = "Lorem ipsum do-lor sit am-et! consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dol-or in repre-henderit! in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

            final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
            final Matcher matcher = pattern.matcher(string);
            try (FileWriter writer = new FileWriter("result.txt")) {
                while (matcher.find()) {
                    String s = string.substring(matcher.start(), matcher.end());
                    writer.write(s+"\n");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
}




