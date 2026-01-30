package StringProblems;

import java.util.Arrays;

 class StringRepeatedCharacters {
	
public static void main(String[]args) {
	String s="Tapacad";
	s.substring(3);
}}
   /*  String s="SRINIVAS ";
	for (int i = 0; i < s.length(); i++) {
	    char ch = s.charAt(i);
	    //if (ch == ' ') continue;

	    if (s.indexOf(ch) != s.lastIndexOf(ch)&& s.indexOf(ch) == i ) {
	        System.out.print(ch +" ");
	        }
	} 
	}
}                  
                       // OR 
	

	
//String s = "mam tat cacdonald Accenture";
/*
for (int i = 0; i < s.length(); i++) {
    char ch = s.charAt(i);
    if (ch == ' ') continue;

    boolean isDuplicate = false;
    boolean alreadyPrinted = false;

    // Check if it appears again
    for (int j = i + 1; j < s.length(); j++) {
        if (ch == s.charAt(j)) {
            isDuplicate = true;
            break;
        }
    }

    // Check if it appeared before
    for (int k = 0; k < i; k++) {
        if (ch == s.charAt(k)) {
            alreadyPrinted = true;
            break;
        }
    }

    // Print only once
    if (isDuplicate &&!alreadyPrinted) {
        System.out.print(ch + " ");
    }
}

		
}}*/
