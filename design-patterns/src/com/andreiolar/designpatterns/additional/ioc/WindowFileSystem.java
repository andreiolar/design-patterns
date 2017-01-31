package com.andreiolar.designpatterns.additional.ioc;

/**
 * @author Andrei Olar
 **/
public class WindowFileSystem implements FileSystem {

	@Override
	public String readFile() {
		return "Windows file system read";
	}
}
