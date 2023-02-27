package utils;

import enums.Constants;

import java.security.SecureRandom;

public class StringUtils {
    public static String random(){
        final String az = "abcdefghijklmnopqrstuvwxyz";
        SecureRandom srnd = new SecureRandom();

        StringBuilder sb = new StringBuilder(Constants.RANDOM);
        for(int i = 0; i < Constants.RANDOM; i++ )
            sb.append( az.charAt( srnd.nextInt(az.length()) ) );
        return sb.toString();
    }
}
