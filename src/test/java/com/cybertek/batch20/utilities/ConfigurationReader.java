package com.cybertek.batch20.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

        //#1- We created the properties object
        private static Properties properties = new Properties();


        static{
            //#2- We get the path and pass it into FileInputStream, to open the file
            //#3- We load the opened file into properties object
            String path = "config.properties";
            try {
               // Scanner scan = new Scanner(System.in);
                FileInputStream file = new FileInputStream(path);
                properties.load(file);

                //#5- close the file
                file.close();

            } catch (IOException e) {
                //e.printStackTrace();
                System.out.println("Properties file not found");
            }
        }

        //#4- We read from file
        public static String getProperty(String keyWord){

            return properties.getProperty(keyWord);
        }


    }



