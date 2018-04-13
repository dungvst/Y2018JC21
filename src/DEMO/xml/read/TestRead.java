package DEMO.xml.read;

import DEMO.xml.model.Item;

import java.util.List;

public class TestRead {
    public static void main(String args[]) {
        StaXParser read = new StaXParser();
        List<Item> readConfig = read.readConfig("src/DEMO/xml/config.xml");
        for (Item item : readConfig) {
            System.out.println(item);
        }
    }
}
