package DatabaseConnection;
import java.sql.*;
import javax.sql.*;
public class CRUDOperation {
	
	static Statement st;
	Connection cn;
	
	public CRUDOperation() {
		cn =databaseConnection.getConnection();
		try {
			st=cn.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void insert(String accno,String accname,int balance) {
		String iquery="insert into account values('"+accno+"','"+accname+"','"+balance+"')";
		
		try {
			
			int result=st.executeUpdate(iquery);
			if(result>0) {
				System.out.println("Data Inserted...");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void delete(String accno) {
		String dquery="delete from account where accno='"+accno+"'";
		
		try {
			int result=st.executeUpdate(dquery);
			if(result>0) {
				System.out.println("Data Deleted...");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void update(String accname,String accno) {
		String uquery="update account set accname='"+accname+"' where accno='"+accno+"'";
		try {
			int result=st.executeUpdate(uquery);
			System.out.println("Data Updated...");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public static void getData() {
		String getdata="select * from account";
		
		try {
			ResultSet r=st.executeQuery(getdata);
			
			while(r.next()) {
				
				System.out.println(r.getString(1)+" "+r.getString(2)+" "+r.getInt(3));
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
	



