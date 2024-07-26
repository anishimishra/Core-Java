package methodreferences;

public class ConstructorReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Messageable hello = Message::new;
		hello.getMessage("Hello");
	}

}
