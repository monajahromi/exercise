package com.mapsa.exercise.seriesa.f;

public class MatchLastItemEzati {
	  public static boolean matchLastItem(String[] t) {
		  String joined = "";
		  for (int i = 0; i < t.length - 1; i++) {
			  joined += t[i];
		  }
		  if (joined.equals(t[t.length - 1]))
			  return true;
		  else
			  return false;
	  }
}