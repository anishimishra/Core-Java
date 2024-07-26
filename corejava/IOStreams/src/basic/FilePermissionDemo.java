package basic;

import java.io.FilePermission;
import java.security.PermissionCollection;

public class FilePermissionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st = "F:\\JAVA\\IOFiles\\FilePermissionDemo\\PermissionDemo.txt";
		FilePermission file1 = new FilePermission("F:\\JAVA\\IOFiles\\FilePermissionDemo\\-", "read");
		PermissionCollection permission = file1.newPermissionCollection();
		permission.add(file1);
		FilePermission file2 = new FilePermission(st, "write");
		permission.add(file2);
		if (permission.implies(new FilePermission(st, "read,write"))) {
			System.out.println("Read, write permission is granted for the path");
		} else {
			System.out.println("No Read, write permission is granted for the path");
		}
	}

}
