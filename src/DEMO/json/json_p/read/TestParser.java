package DEMO.json.json_p.read;

import DEMO.json.json_p.model.Company;

public class TestParser {
    public static void main(String[] args) {
        JsonPParser jsonPParser = new JsonPParser();
        Company company = jsonPParser.readConfig("src/DEMO/json/json_p/config/Company.json");
        System.out.println(company);
    }
}
