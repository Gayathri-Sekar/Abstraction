package Problem2;

public class GlassDoor extends Door{
	 private String gas;
	public GlassDoor(String name, String gas) {
		super(name);
		this.gas=gas;
	}
	public String getGas() {
		return gas;
	}
	public void setGas(String gas) {
		this.gas = gas;
	}
	void unlock()
	{
		String a=gas;
	      char[] ch = new char[a.length()]; 
	      int num=a.length();
	      int count=0;
	      for (int i = 0;i<a.length();i++) 
	      { 
	            ch[i] = a.charAt(i); 
	      }
	      if(num%2==0)
	      {
	         for(int i=0;i<num;i++)
	         {
	          for(int j=i+1;j<num;j++)
	          {
	              if(ch[i]==ch[j])
	              {
	                  ch[i]=0;
	                  count++;
	              }
	           }
	         }
	         if(count*2-num==0)
	         {
	          System.out.print("Never say never. Palindrome, forever.");
	         }
	          else
	          {
	          System.out.print("We cannot fish. Palindrome? You wish");
	          }
	        }
	        else if(num%2==1)
	        {
	           for(int i=0;i<num;i++)
	           {
	           for(int j=i+1;j<num;j++)
	            {
	              if(ch[i]==ch[j])
	              {
	                  ch[i]=0;
	                  count++;
	                  
	              }
	            }
	           }
	          if(num-count*2==1)
	          {
	          System.out.print("Never say never. Palindrome, forever.");
	          }
	          else
	          {
	          System.out.print("We cannot fish. Palindrome? You wish");
	          }
	          
	       }	
	}
	
}
