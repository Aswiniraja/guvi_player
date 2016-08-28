public static void main(String[] args)
{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int n1=sc.nextInt();
		int count=0;
		int i,j;
		
		for(i=n;i<=n1;i++)
		{
			for(j=2;j<i;j++)
			{
				if(i%j==0)
					break;
			}
			if(i==j)
				count++;
		}

	}
