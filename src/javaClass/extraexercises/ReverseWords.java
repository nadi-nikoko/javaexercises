package javaClass.extraexercises;

import javaClass.reuseFunctions.FunctionText;

public class ReverseWords {

    public static void main(String[] args) {

    String text= FunctionText.readString("insert a text") + " ";
    String invertedText = "";

    for (int i=0; i<text.length(); i++){
        if(Character.isWhitespace(text.charAt(i))){
            int j = i -1;
            while(!Character.isWhitespace(text.charAt(j))){
                invertedText += text.charAt(j);
                if (j > 0){
                    j--;
                } else break;
            }
            if(text.length() > invertedText.length())
            invertedText += " ";
        }

    }
    System.out.println(invertedText);
}
    
    /*
        String text= FunctionText.readString();
        String invertedString = "";

        for (int i=text.length()-1; i>=0; i--){
            if(!Character.isWhitespace(text.charAt(i))){
                System.out.print(text.charAt(i));
            }
            if(Character.isWhitespace(text.charAt(i))){
                System.out.print(" ");
            }
        }
    }
    */
}

/* 
 * it needs to run till it find the white space
 * once it finds it goes backwards saving the words
*/


