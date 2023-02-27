package enums;

import utils.ReadProperties;

public class Constants {
    public static final String PROPERTY_PATH = "src//test//resources//data.properties";
    public static final String TEST_PATH = "src//test//resources//data.properties";

    public static final String BROWSER = ReadProperties.getStringProperty(PROPERTY_PATH, "browser.name");
    public static final String LANGUAGE = ReadProperties.getStringProperty(PROPERTY_PATH, "language");
    public static final String PATH = ReadProperties.getStringProperty(TEST_PATH, "path");
    public static final int RANDOM = ReadProperties.getIntProperty(TEST_PATH, "random");
    public static final String SEARCH_WORD = ReadProperties.getStringProperty(TEST_PATH, "searchWord");
}
