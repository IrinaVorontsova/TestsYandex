package enums;

import utils.ReadProperties;

public class Constants {
    public static final String PROPERTY_PATH = "src//test//resources//data.properties";
    public static final String TEST_PATH = "src//test//resources//data.properties";

    public static final String BROWSER = ReadProperties.getStringProperty(PROPERTY_PATH, "browser.name");
    public static final String LANGUAGE = ReadProperties.getStringProperty(PROPERTY_PATH, "language");
    public static final String PATH = ReadProperties.getStringProperty(TEST_PATH, "path");
}
