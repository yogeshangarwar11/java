package oops;

import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBoperations {
	Connection connection;
	Statement statement;
	ResultSet resultset;
	public DBoperations() {
		connection = MySqlConnection.getInstance();
	}
	public int insertDataWithStatement(Student std) {
		int result = 0;
		String query = "insert into Student values("+std.getSI_no()+",'"+std.getName()+
				"',"+std.getMarks()+",'"+std.getPercentage()+"')";
		try {
			statement =connection.createStatement();
			result = statement.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	public static void main(String[] args) {
		DBoperations db = new DBoperations();
		Scanner sc = new Scanner(System.in);
		Student st = new Student();
		System.out.println("enter SI_no ");
		st.setSI_no(sc.nextInt());
		sc.nextLine();
		System.out.println("enter your name");
		st.setName(sc.nextLine());
		System.out.println("enter marks");
		st.setMarks(sc.nextInt());
		sc.nextLine();
		System.out.println("enter percentage");
		st.setPercentage(sc.nextDouble());
		db.insertDataWithStatement(st);

	}

}
