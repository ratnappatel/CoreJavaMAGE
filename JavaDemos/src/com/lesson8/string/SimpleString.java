package com.lesson8.string;

class SimpleString  {

   public static void main(String args[])  {

     // Simple String Operations
      char c[] = {'J', 'a', 'v', 'a'};
      String s1 = new String(c);
      String s2 = new String(s1); 

      System.out.println(s1);
      System.out.println(s2);

      // Using concatenation to prevent long lines.
      String longStr = "This could have been " +
                             "a very long line that would have " +
                             "wrapped around.  But string concatenation " +
                             "prevents this.";

       System.out.println(longStr);
   }
}
