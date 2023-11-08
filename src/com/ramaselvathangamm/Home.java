package com.ramaselvathangamm;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.lang.reflect.Method;

public class Home {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<File> packages = new ArrayList<File>();
		loadPackages(packages);
		boolean flag = true;
		do {
			displayFiles(packages);
			System.out.print("Enter the Package Number or Enter '-1' to Exit : ");
			int input = scan.nextInt();
			if (input > 0 && input <= packages.size()) {
				File packageFile = packages.get(input - 1);
				ArrayList<File> classes = new ArrayList<File>();
				loadClasses(packageFile, classes);
				displayFiles(classes);
				System.out.print("Enter the File Number : ");
				int classIndex = scan.nextInt();
				if (classIndex > 0 && classIndex <= classes.size()) {
					try {
						invokeFile(classes.get(classIndex - 1));
					} catch (Exception e) {
						e.printStackTrace();
					}

				}

			} else if (input > packages.size()) {
				System.out.print("Enter an Valid Input");
			} else if (input == -1) {
				flag = false;
			}
		} while (flag);
		scan.close();
	}

	private static void loadPackages(ArrayList<File> fileList) {
		String packagePath = "src/com/ramaselvathangamm";
		File file = new File(packagePath);
		for (File f : file.listFiles()) {
			if (f.isDirectory()) {
				fileList.add(f);
			}
		}
	}

	private static void displayFiles(ArrayList<File> fileList) {
		int index = 1;
		System.out.println("Packages Present : ");
		for (File f : fileList) {
			System.out.println(index++ + ". " + f.getName().replace(".java",""));
		}
	}

	private static void loadClasses(File filePath, ArrayList<File> classes) {
		classes.clear();
		File[] file = filePath.listFiles();
		for (File cls : file) {
			if (cls.isFile() && cls.getName().endsWith(".java")) {
				classes.add(cls);
			}
		}
	}

	private static void invokeFile(File file) throws Exception {
		String filePath = file.getPath().substring(4).replaceAll("\\\\", ".").replace(".java", "");
		Class<?> instance = Class.forName(filePath);
		Method mainMethod = instance.getMethod("main", String[].class);
		String[] arguments = new String[1];
		mainMethod.invoke(null, (Object) arguments);
		return;
	}
}
