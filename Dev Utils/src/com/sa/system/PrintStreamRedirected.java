package com.sa.system;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamRedirected {
	public static void startOutpuRedirect(String logFile) {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(logFile);
			PrintStream ps = new PrintStream(fos);
			System.setOut(ps);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void stopOutpuRedirect() {
		PrintStream console = System.out;
		System.setOut(console);
	}
}