package com.sa.file;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class FileWriter {
	public static void listToFile(List<String> list, File file) throws IOException {

		try (java.io.FileWriter os = new java.io.FileWriter(file);) {
			for (String line : list) {
				os.write(line);
				os.write(System.lineSeparator());
			}
			os.flush();
		}
	}
}