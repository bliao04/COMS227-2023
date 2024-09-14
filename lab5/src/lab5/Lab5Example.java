package lab5;

public class Lab5Example
{
  public static void main(String[] args)
  {
    System.out.println(longestRun("aabbbccd"));
    System.out.println("Expected 3");
    System.out.println(longestRun("aaa"));
    System.out.println("Expected 3");
    System.out.println(longestRun("aabbbb"));
    System.out.println("Expected 4");
  }
  
 
  public static int longestRun(String s)
  {
    int count = 0; //changed from 1 to 0
    int max = 1;
    
    // start with the first character, see how long a run there is
    char current = s.charAt(0);
    for (int i = 0; i <= s.length() - 1; i ++)
    {
      char c = s.charAt(i);
      if (c == current)
      {
        // matches the 'current' character, add 1
        count += 1;
      }
      else
      {
        // that was the end of the run; if it was a longer run, make that the max
        if (count > max)
        {
          max = count; // changed so max = count instead of count = max
        }
        current = c;
      
      count = 1; // added to reset count to 1
      } // Added if statement after 
	    if (i == s.length()-1) {
	    	if (count > max)
	        {
	          max = count;
	        }
    }
   }
  
  
    // this should be the length of the longest run we found
    return max;
  }

  
  
}
