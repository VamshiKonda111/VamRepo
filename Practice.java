import java.util.*;
public class Practice
{
	
	public static void main(String args[])
	{
		int age;
		Scanner s = new Scanner(System.in);
		age = s.nextInt();
		if(age>=18)
		{
			System.out.println("Eligible to vote");
		}
		else
		{
			throw new NotEligibleException("not eligibele to vote");
		}
	}
	
}
class NotEligibleException extends RuntimeException
{
	public NotEligibleException(String s)
	{
		System.out.println(s);
	}
}
