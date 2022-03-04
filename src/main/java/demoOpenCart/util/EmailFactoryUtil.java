package demoOpenCart.util;

import org.apache.commons.lang.RandomStringUtils;

public class EmailFactoryUtil {

    //generate random email address
    public static String createNewEmailAddress() {
        return getRandomAlphaNumeric() + "@example.com";
    }

    //generate random alphanumeric string
    private static String getRandomAlphaNumeric() {
        return RandomStringUtils.randomAlphanumeric(21);
    }
}
