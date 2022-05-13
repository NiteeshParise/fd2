//TO INSERT DATA INTO REGISTRATION TABLE 
import java.util.Scanner;
import java.sql.*;
class Register
{
	public static void main(String args[])
	{
		try{
			String full_name,user_name,email,phno,pwd,cpwd,gender;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter full_name : ");
		full_name=sc.next();
		System.out.println("enter user_name : ");
		user_name=sc.next();
		System.out.println("enter email id : ");
		email=sc.next();
		System.out.println("enter phone number : ");
		phno=sc.next();
		System.out.println("enter your password : ");
		pwd=sc.next();
		System.out.println("confirm your password :");
		cpwd=sc.next();
		System.out.println("select your gender :");
		gender=sc.next();
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:localhost:1521:orcl","scott","niteesh123");
			//System.out.println("connection established");
			PreparedStatement ps=con.prepareStatement("insert into register values(?,?,?,?,?,?,?)");
			ps.setString(1,full_name);
			ps.setString(2,user_name);
			ps.setString(3,email);
			ps.setString(4,phno);
			ps.setString(5,pwd);
			ps.setString(6,cpwd);
			ps.setString(7,gender);
			ps.executeUpdate();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}