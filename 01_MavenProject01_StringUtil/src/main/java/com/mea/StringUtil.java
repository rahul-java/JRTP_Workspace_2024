package com.mea;

import java.util.StringTokenizer;

public class StringUtil 
{
   public static int countWords(String str)
   {
	   StringTokenizer tokenizer = new StringTokenizer(str, " ");
	   int count=tokenizer.countTokens();
	   return count;
   }
}
