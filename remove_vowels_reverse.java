public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		String s=sc.next();
		String s1="aeiouAEIOU";
		String ss="";
		
		for(int i=0;i<s.length();i++)
		{
			if(s1.contains(String.valueOf(s.charAt(i))))
			{}
			else
			{
				ss=ss+String.valueOf(s.charAt(i));
			}
		}
		ss=new StringBuffer(ss).reverse().toString();
		
		System.out.println(ss);
	}
