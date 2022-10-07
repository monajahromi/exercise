package com.mapsa.exercise.seriesa.f;

public class MatchLastItemNorouzi {
	  public static boolean matchLastItem(String[] t) {
		  String temp = "";
		  for(int i = 0; i< t.length; ++i){
			  temp+=t[i]+ " ";
		  }
		  String[] sp = temp.split(" ");
		  String temp2 = "";
		  for(int i = 0; i< sp.length; ++i){
			  if(i == sp.length-1)break;
			  else{
				  temp2+=sp[i];
			  }
		  } return temp2.equals(t[t.length-1])?true:false;
			
	  }
}