package First;

public class CommandLineArguments {
	public static void main(String[] args) {
		int length = args.length;
		if (length == 0) {
			System.out.println("No inputs provided");
		} else {
			System.out.println("List of arguments : ");
			for (int i = 0; i < length; i++) {
				System.out.println(args[i]);
			}
		}
	}
}
// go to drop down menu beside run click on run configurations select the class name 
// you want to run then go to Arguments then Program Arguments 
// inside it place the arguments which needs to be sent