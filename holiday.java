public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
		s=s.toUpperCase();
		if(s.equals("MONDAY")||s.equals("TUESDAY")||s.equals("WEDNESDAY")||s.equals("THURSDAY")||s.equals("FRIDAY"))
		{
			System.out.println("true");
		}
		else if(s.equals("SATURDAY")||s.equals("SUNDAY"))
		{
			System.out.println("false");
		}
		else
		{
			System.out.println("invalid");
		}
	}
