package utils;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class ReadProperties {

    public static Properties getProperties(String propertyPath){
        Properties properties = new Properties();

        try (FileInputStream fileInputStream =
                     new FileInputStream(propertyPath)) {

            properties.load(fileInputStream);

            return properties;

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String getStringProperty(String propertyPath, String key) {
        return getProperties(propertyPath).getProperty(key);
    }

    public static int getIntProperty(String propertyPath,String key) {
        return Integer.parseInt(getProperties(propertyPath).getProperty(key));
    }
}
