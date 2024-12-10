package utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import config.configPOJOClasses.AppConfig;

import java.io.File;
import java.io.IOException;

public class ReadConfig {

    static String APP_CONFIG_FILE_PATH = System.getProperty("user.dir")+"\\src\\main\\java\\config\\appConfig.json";
    static AppConfig appConfig = null ;

    public static void readAppConfig(){

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            System.out.println(APP_CONFIG_FILE_PATH);
            appConfig = objectMapper.readValue(new File(APP_CONFIG_FILE_PATH), AppConfig.class);
            System.out.println(appConfig);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getAppConfig(String parameter){
        return appConfig.getBaseUrl();
    }


}
