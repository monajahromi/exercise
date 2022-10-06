package com.mapsa.exercise.seriesa.h;

public class ValidZipCodeShahabi {
    public static boolean isValid(String zip) {
		/*for (int i = 0; i < zip.length(); i++) {
			char charArray = zip.charAt(i);
			if (!Character.isDigit(charArray)) {
				return false;
			}
		}
		String[] splitedZip = zip.split("(?!^)");
		if (splitedZip.length > 5) {//most not be greater than 5 digits in length
			System.out.println("most not be greater than 5 digits");
			return false;
		}
return true;
	}*/
        String[] splitedZip = zip.split("(?!^)");
        if (splitedZip.length > 5) {
            return false;
        }
        int count = 0;
        for (int i = 0; i < splitedZip.length; i++) {
            if (splitedZip[i].equals("0") ||
                    splitedZip[i].equals("1") ||
                    splitedZip[i].equals("2") ||
                    splitedZip[i].equals("3") ||
                    splitedZip[i].equals("4") ||
                    splitedZip[i].equals("5") ||
                    splitedZip[i].equals("6") ||
                    splitedZip[i].equals("7") ||
                    splitedZip[i].equals("8") ||
                    splitedZip[i].equals("9"))
                count += 0;
            else
                count += 1;
        }
        if (count > 0) {
            return false;
        } else
            return true;
    }
}