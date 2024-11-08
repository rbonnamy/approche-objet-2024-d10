package config;

import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;

import java.util.ResourceBundle;

public class TestAccesProperties {
    public static void main(String[] args) {
        ResourceBundle fichier = ResourceBundle.getBundle("config");
        String url = fichier.getString("database.url");
        //System.out.println(url);

        Configurations configs = new Configurations();
        try {
            Configuration config = configs.properties("config.properties");
            System.out.println(config);

        } catch (ConfigurationException e) {
            System.out.println("Fichier inaccessible :"+e.getMessage());
        }
    }
}
