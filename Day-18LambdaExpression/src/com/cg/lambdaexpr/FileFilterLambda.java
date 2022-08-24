package com.cg.lambdaexpr;

import java.io.File;
import java.io.FileFilter;

public class FileFilterLambda {

	public static void main(String[] args) {
		//lambda expression for searching the file in given path of particular expression
		FileFilter filter=(File pathname)->pathname.getName().endsWith(".pptx");
		File dir = new File("E:\\");
		File contents[]=dir.listFiles(filter);
		//enhance for loop
		/*if any particular extension file is open on you system 
		 then you will get that file in two times
		with one file will be in $ sign*/
		for(File i:contents)
		{
			System.out.println(i);
		}
	}

}
