package DEMO.json.json_p.read;

import DEMO.json.json_p.model.Address;
import DEMO.json.json_p.model.Company;

import javax.json.Json;
import javax.json.stream.JsonParser;
//import javax.json.stream.JsonParser;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class JsonPParser {

    public Company readConfig(String configFile) {
        Company company = new Company();
        try {
            InputStream inputStream = new FileInputStream(configFile);
            JsonParser jsonParser = Json.createParser(inputStream);

            Address address = new Address();
            List<String> websitesList = new ArrayList<String>();

            String keyName = null;

            while (jsonParser.hasNext()) {
                JsonParser.Event event = jsonParser.next();
                switch (event) {
                    case KEY_NAME:
                        keyName = jsonParser.getString();
                        break;
                    case VALUE_STRING:
                        setStringValues(company, address, keyName, jsonParser.getString(), websitesList);
                        break;
                    case VALUE_NUMBER:
                        setNumberValues(company, address, keyName, jsonParser.getInt());
                        break;
                    default:
                        // Do nothing
                }
            }
            company.setAddress(address);
            String[] websites = new String[websitesList.size()];
            websitesList.toArray(websites);
            company.setWebsites(websites);

            inputStream.close();
            jsonParser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return company;
    }

    private void setNumberValues(Company company, Address address, String keyName, int value) {
        if (keyName.equals("id")) {
            company.setId(value);
        } else {
            System.out.println("Unknown Key:" + keyName);
        }
    }

    private void setStringValues(Company company, Address address, String keyName, String value,
                                        List<String> websiteList) {
        if (keyName.equals("name")) {
            company.setName(value);
        } else if (keyName.equals("street")) {
            address.setStreet(value);
        } else if (keyName.equals("city")) {
            address.setCity(value);
        } else if (keyName.equals("websites")) {
            websiteList.add(value);
        } else {
            System.out.println("Unknown Key=" + keyName);
        }
    }

}
