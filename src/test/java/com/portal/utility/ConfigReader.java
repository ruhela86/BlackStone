package com.portal.utility;

public class PropReader {

        private Properties properties;
        private final String propertyFilePath= "src/test/resources/configFile/qa.properties";


        public void ConfigFileReader(){
                BufferedReader reader;
                try {
                        reader = new BufferedReader(new FileReader(propertyFilePath));
                        properties = new Properties();
                        try {
                                properties.load(reader);
                                reader.close();
                        } catch (IOException e) {
                                e.printStackTrace();
                        }
                } catch (FileNotFoundException e) {
                        e.printStackTrace();
                        throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
                }
        }

        public String getDriverPath(){
                String driverPath = properties.getProperty("driverPath");
                if(driverPath!= null) return driverPath;
                else throw new RuntimeException("driverPath not specified in the Configuration.properties file.");
        }

        public long getImplicitlyWait() {
                String implicitlyWait = properties.getProperty("implicitlyWait");
                if(implicitlyWait != null) return Long.parseLong(implicitlyWait);
                else throw new RuntimeException("implicitlyWait not specified in the Configuration.properties file.");
        }

        public String getApplicationUrl() {
                String url = properties.getProperty("url");
                if(url != null) return url;
                else throw new RuntimeException("url not specified in the Configuration.properties file.");
        }


}
