import java.sql.*;
class jdbcdemo
{
	public static void main(String args[])
	{
		Connection conn=null;
		ResultSet rs=null;
		Statement stmt=null;
		
		try
		{
			Class.forName("org.postgresql.Driver");
			conn=DriverManager.getConnection("jdbc:postgresql://localhost/test","postgres","postgres");
			if(conn==null)
			{
				System.out.println("connection fail");
			}
			else
			{	
				stmt=conn.createStatement();
				rs=stmt.executeQuery("select * from emp");
				System.out.println("eid\t ename\t sal");
				
				while(rs.next())
				{
					System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3));
				}
			}
			conn.close();
		}
		catch(Exception e)
		{
			System.out.println("error ala re"+e);
		}
	}
}	
