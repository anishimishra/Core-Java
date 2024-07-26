package anonymousinner;

public class DriverManager {
	static Connection getConnection() {
		Connection con = new Connection() {

			@Override
			public void createStatement() {
				// TODO Auto-generated method stub
				System.out.println("Anonymous Inner classes method");
			}
		};
		return con;
	}
}
