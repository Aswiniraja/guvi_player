public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		a=Integer.parseInt(new StringBuffer(String.valueOf(a)).reverse().toString());
		System.out.println(a);

	}
