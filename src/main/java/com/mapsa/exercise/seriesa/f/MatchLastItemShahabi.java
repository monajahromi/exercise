package com.mapsa.exercise.seriesa.f;

public class MatchLastItemShahabi {
	  public static boolean matchLastItem(String[] t) {
		  String concatElements = "";
		  for (int i = 0; i < t.length-1; i++) {
			  concatElements = concatElements.concat(t[i]);
		  }
		  if (concatElements.equals(t[t.length - 1]))
			  return true;
		  else
			  return false;
	  }
}