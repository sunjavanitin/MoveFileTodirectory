package com.nitin.movefile;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class FileMove {
	
	public static void main(String[] args) throws IOException {

		File source = new File("Source/nitin");
		File destination = new File("Destination");

		FileUtils.moveFileToDirectory(source, destination, true);

	}
	

}
