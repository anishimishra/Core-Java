package maps;
import java.util.*;
public class IdentityHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<Integer,String> map=new IdentityHashMap<>();
Integer id1=new Integer(10);
Integer id2=new Integer(10);
map.put(id1,"Bharath");
map.put(id2,"Sharath");
System.out.println(map);
	}

}
