package customexceptions;

public class Test {

	public static void main(String[] args) throws CheckedCustomException {
		// TODO Auto-generated method stub
		// throw new UncheckedCustomException("Business Exception occured");
		throw new CheckedCustomException("Business Exception that needs to be handled");
	}

}
