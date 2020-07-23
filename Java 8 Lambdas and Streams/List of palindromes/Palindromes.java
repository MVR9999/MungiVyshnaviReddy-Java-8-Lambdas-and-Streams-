import java.util.*; 
  
class Palindromes{ 
  public static ArrayList<String> find(String s[])
  {
	ArrayList<String> a=new ArrayList<>();
	  for(String i:s)
	  {
		  StringBuilder sb=new StringBuilder(i);
		  sb.reverse();
		  if(i.equals(sb.toString()))
			  a.add(i);
	  }
	  return a;
  }
    public static void main(String[] args) 
    { 
	String s[]={"aba","madam","aavb","dacd","malayalam","add"};
	ArrayList<String> l=new ArrayList<>();
	l=find(s);
	
	System.out.println(l.toString());
	}
}
