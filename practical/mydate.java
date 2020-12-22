import java.util.*;

class InvalidDateException extends Exception
{
	InvalidDateException(String msg)
	{
		super(msg);
	}
}

class mydate
{
	int day;
	int month;
	int year;
	
	mydate()
	{
		day=1;
		month=1;
		year=2019;
	}
	mydate(int d,int m,int y)
	{
		day=d;
		month=m;
		year=y;
	}
	
	
		public void accept()throws Exception
		{
			Scanner sc=new Scanner(System.in);
		try
		{	
			
			System.out.println("enter the day-->");
			day=sc.nextInt();
			System.out.println("enter the month-->");
			month=sc.nextInt();
			System.out.println("enter the year-->");
			year=sc.nextInt();
		
	
		if((day>30 || day<0) && (month==4 || month==6 || month==9 || month==11))
		{
			InvalidDateException ob=new InvalidDateException("\n date is not correct1");
			throw ob;
		}
		else if((day>31||day<0)&&(month==1||month==3||month==5||month==7||month==8||month==10||month==12))
		{
			InvalidDateException ob=new InvalidDateException("\n date is not correct2");
			throw ob;
		}
		else if((day>28 || day<0) && (year%4)!=0 && month==2)
		{
			InvalidDateException ob=new InvalidDateException("\n date is not correct3");
			throw ob;
		}
		else if((day>28 || day<0) && (year%4)==0 && month==2)
		{
			InvalidDateException ob=new InvalidDateException("\n date is not correct4");
			throw ob;
		}
		else if(month>12 || month<0)
		{
			InvalidDateException ob=new InvalidDateException("\n date is not correct5");
			month=1;
			throw ob;
		}
	}
	catch(NumberFormatException ie)
	{
		System.out.println(ie);
	}
	catch(InvalidDateException ie)
	{
		System.out.println(ie);
	}
	}

public void display()
{
	System.out.println(day+"/"+month+"/"+year);
	
}
}
class abc
{
	public static void main(String args[]) throws Exception
	{
		mydate my=new mydate();
		my.accept();
		System.out.println("\n\n");
		my.display();
	}			
}


