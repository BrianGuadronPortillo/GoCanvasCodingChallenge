package com.exampledemo.utilities;

public class BrowserUtility {
	
	public static void waitFor(int sec) {
		try {
			Thread.sleep(sec * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
}
