package com.turkcell.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

//Belirtilen isme sahip bir config dosyası yüklemek ve içieriğini properties nesnesi olarak döndürme işlemi yapar
public class ConfigLoader {
    public static Properties getConfig(String name) {
        Properties prop;
        try (InputStream input = ConfigLoader.class.getClassLoader().getResourceAsStream(String.format("%s.properties", name))) {
            prop = new Properties();
            prop.load(input);

        } catch (IOException ex) {
            throw new RuntimeException("Konfigürasyon dosyası okunamadı.");
        }
        return prop;
    }
}
