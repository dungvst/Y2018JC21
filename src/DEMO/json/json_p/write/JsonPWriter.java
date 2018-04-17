package DEMO.json.json_p.write;

import DEMO.json.json_p.model.Address;
import DEMO.json.json_p.model.Company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.json.JsonWriter;

public class JsonPWriter {

    public void writeConfig(String configFile){
        Company company = createCompany();
        JsonObjectBuilder companyBuilder = Json.createObjectBuilder();
        JsonObjectBuilder addressBuilder = Json.createObjectBuilder();
        JsonArrayBuilder websitesBuilder = Json.createArrayBuilder();

        for (String website : company.getWebsites()) {
            websitesBuilder.add(website);
        }

        Address address = company.getAddress();
        addressBuilder.add("street", address.getStreet()).add("city", address.getCity() );
        companyBuilder.add("id", company.getId()).add("name", company.getName() );
        companyBuilder.add("websites", websitesBuilder);
        companyBuilder.add("address", addressBuilder);

        JsonObject rootJSONObject = companyBuilder.build();

        System.out.println("Root JsonObject: " + rootJSONObject);

        // Ghi ra file.
        File outFile= new File(configFile);
        outFile.getParentFile().mkdirs();

        OutputStream os = null;
        try {
            os = new FileOutputStream(outFile);
            JsonWriter jsonWriter = Json.createWriter(os);

            jsonWriter.writeObject(rootJSONObject);
            jsonWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private Company createCompany() {

        Company company = new Company();
        company.setId(123);
        company.setName("VST");

        String[] websites = { "http://website.com"};
        company.setWebsites(websites);

        Address address = new Address();
        address.setCity("Ha Noi");
        address.setStreet("My Dinh");

        company.setAddress(address);

        return company;
    }

}
