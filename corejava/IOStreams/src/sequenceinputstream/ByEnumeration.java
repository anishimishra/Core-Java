package sequenceinputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class ByEnumeration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FileInputStream fin1=null, fin2=null,fin3=null,fin4=null;
SequenceInputStream sis=null;
FileOutputStream fos=null;
try {
fin1=new FileInputStream("F:\\JAVA\\IOFiles\\a.txt");
fin2=new FileInputStream("F:\\JAVA\\IOFiles\\b.txt");
fin3=new FileInputStream("F:\\JAVA\\IOFiles\\c.txt");
fin4=new FileInputStream("F:\\JAVA\\IOFiles\\d.txt");
fos=new FileOutputStream("F:\\JAVA\\IOFiles\\abcd.txt");
Vector v=new Vector();
v.add(fin1);
v.add(fin2);
v.add(fin3);
v.add(fin4);
Enumeration e=v.elements();
sis=new SequenceInputStream(e);
int i;
while((i=sis.read())!=-1) {
	fos.write(i);
	System.out.print((char)i);
}
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}finally {
	try {
		sis.close();
		fin1.close();
		fin2.close();
		fin3.close();
		fin4.close();
		fos.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
	}

}
