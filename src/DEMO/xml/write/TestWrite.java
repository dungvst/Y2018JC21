package DEMO.xml.write;

public class TestWrite {
    public static void main(String[] args) {
        StaxWriter configFile = new StaxWriter();
        configFile.setFile("src/DEMO/xml/config2.xml");
        try {
            configFile.saveConfig();
            System.out.println("Write successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
