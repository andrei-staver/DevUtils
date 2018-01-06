package com.sa.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileReaderUtil {
	public static ArrayList<String> getTxtLines(String inFilePath) throws FileNotFoundException, IOException {
		File file = new File(inFilePath);
		ArrayList<String> listLines = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line;
			while ((line = br.readLine()) != null) {
				listLines.add(line);
			}
		}
		return listLines;
	}

	public static String getTextContent(String textFilePath) {
		BufferedReader br = null;
		String content = null;
		try {
			br = new BufferedReader(new FileReader(textFilePath));
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();
			while (line != null) {
				sb.append(line);
				line = br.readLine();
			}
			content = sb.toString();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return content;
	}
}