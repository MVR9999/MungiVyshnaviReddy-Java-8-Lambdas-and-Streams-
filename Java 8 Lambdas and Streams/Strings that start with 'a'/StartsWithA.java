import java.util.*; 
  
class StartsWithA{ 
  public static ArrayList<String> find(String s[])
  {
	ArrayList<String> a=new ArrayList<>();
	  for(String i:s)
	  {
		  if(i.charAt(0)=='a' && i.length()==3)
			  a.add(i);
	  }
	  return a;
  }
    public static void main(String[] args) 
    { 
	String s[]={"abc","bcd","aavb","dacd","acf","add"};
	ArrayList<String> l=new ArrayList<>();
	l=find(s);
	
	System.out.println(l.toString());
	}
}
