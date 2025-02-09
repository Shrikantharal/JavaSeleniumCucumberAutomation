package com.example.utils;

import java.util.Random;

public class Utils {

    private static final Random random = new Random();

    public static String generateRandomString()
    {
    	return generateRandomString(5);
    }
    public static String generateRandomString(int length)
    {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < length; i++) 
        {
            result.append(chars.charAt(random.nextInt(chars.length())));
        }

        return result.toString();
    }

    public static String nameGenerator() 
    {
        return String.format("UIAutomationName%s", generateRandomString(4));
    }

    public static String descriptionGenerator()
    {
        return String.format("UIAutomationDescription%s", generateRandomString(4));
    }
}
