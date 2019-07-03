public class Distinct { 

	static int a=300; 

	static int max(String str, int n) 
	{ 
    	int count[]=new int[a]; 
		for(int i=0;i<n;i++)
		{ 
			count[str.charAt(i)]++; 
		} 
		int b=0; 
		for(int i=0;i<a;i++)
		{ 
			if (count[i]!=0)
			{ 
				b++; 
			} 
		} 
        return b; 
	} 
	
	static int smallest(String str)
	{ 
    	int n=str.length();	
		int b=max(str,n); 
		int c=n; 
        for(int i=0;i<n;i++)
        { 
			for(int j=0;j<n;j++) 
			{ 
				String s=null; 
				if(i<j) 
				{
					s=str.substring(i,j); 
				}
				else
			    {
					s=str.substring(j,i); 
			    }
				int s1=s.length(); 
				int s2=max(s,s1); 
				if(s1<c&&b==s2)
				{ 
					c=s1; 
				} 
			} 
		} 
		return c; 
	} 

	public static void main(String[] args)
	{ 
		String str="abcda"; 
        int len=smallest(str); 
		System.out.println(" The length of the smallest substring consisting of maximum distinct characters : "+len); 
	} 
} 


