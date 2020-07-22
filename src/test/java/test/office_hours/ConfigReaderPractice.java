package test.office_hours;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReaderPractice {


    /**
     * To go into the method/class implementation click and hold control/command and make a click
     *
     * @param args
     */
    public static void main(String[] args) {
//        try with resources used to automatically close input stream
        try (FileInputStream fileInputStream = new FileInputStream("src/test/resources/config.properties")) {
            Properties properties = new Properties();
            properties.load(fileInputStream);
            String browser = properties.getProperty("browser");
            System.out.println(browser);
            //you will get null, if there
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}