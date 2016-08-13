public class max_product 
{

	public static void main(String[] args)
	{
		String[] s=new String[]{"sara","acdf","abc","def"};
		
		int a,co = 0;
		for(int i=0;i<s.length;i++)
		{
			a=0;
			for(int j=0;j<s.length;j++)
			{
				a=0;
				for(int k=0;k<s[j].length();k++)
				{
				
					if(s[i].contains(s[j].substring(k, k+1)))
						a=1;
				}
				if(a==0&&co<s[i].length()*s[j].length())
				co=s[i].length()*s[j].length();	
				
			}
		}
		
System.out.println(co);
	}

}
