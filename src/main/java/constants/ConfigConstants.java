package constants;

import utils.ConfigurationReader;

public class ConfigConstants {

    public static final String URL = ConfigurationReader.getProperty("url");
    public static final String TITLE = ConfigurationReader.getProperty("title");
}
