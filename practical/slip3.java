import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

class bill extends HttpServlet
{
	resultSet rs=null;
	Statement stmt=null;
	connection conn=null;
	try{
	
	public void init()
	{
		class.forName("org.postgresql.Driver");
		conn=DriverManager.getconnection("jdbc:postgresql://192.168.1.51/ty33","ty33","");
		System.out.println("connection succesful");
		
	}
	catch(ClassNotFoundException e) {}
	catch(SQLException e1) {}
	}	

public void doGet(httpservletReqest req,httpservletresponce res) throws servletexception,ioexception
{
	res.setcontenttype("text/html");
	printwriter pw=res.getWriter();
	try
	{
		int bno=integer.pareInt(req.getparameter("bno"));
		stmt
}
}

