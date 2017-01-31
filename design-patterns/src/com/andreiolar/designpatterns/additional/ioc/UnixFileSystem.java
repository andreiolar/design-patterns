package com.andreiolar.designpatterns.additional.ioc;

/**
 * @author Andrei Olar
 **/
public class UnixFileSystem implements FileSystem {

	@Override
	public String readFile() {
		return "Unix file system read";
	}
}
