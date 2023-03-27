package com.n11.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class ConfigurationReader {


    private Properties configFile;

    public ConfigurationReader() {
        {
            try {
                FileInputStream fileInputStream = new FileInputStream("configuration.properties");
                configFile = new Properties();
                configFile.load(fileInputStream);
                fileInputStream.close();
            } catch (IOException e) {
                System.out.println("Failed to load properties file!");
                e.printStackTrace();
            }
        }
    }

    public String getProperty(String key) {
        return configFile.getProperty(key);
    }



}
