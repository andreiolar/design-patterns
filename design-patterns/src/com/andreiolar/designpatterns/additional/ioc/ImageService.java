package com.andreiolar.designpatterns.additional.ioc;

/**
 * @author Andrei Olar
 **/
public class ImageService {

	private FileSystem fileSystem;

	public String readImage() {
		return fileSystem.readFile();
	}

	public void setFileSystem(FileSystem fileSystem) {
		this.fileSystem = fileSystem;
	}

}
