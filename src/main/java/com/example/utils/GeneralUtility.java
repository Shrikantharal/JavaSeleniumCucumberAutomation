package com.example.utils;

import java.io.File;

public class GeneralUtility 
{
	 public static void cleanReports() {
	        File reportDir = new File("target/cucumber-reports");
	        if (reportDir.exists()) {
	            for (File file : reportDir.listFiles()) {
	                if (file.isFile()) {
	                    file.delete();
	                }
	            }
	        }
	    }

}
