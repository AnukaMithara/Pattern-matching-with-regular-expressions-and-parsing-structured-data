package package2019e054;

//import necessary packages
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regularexp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (true) {                          //Run until exit the code
        System.out.print("Input the text : ");
        String text = sc.nextLine();                //Read Regex from user

        System.out.print("Input the pattern : ");
        String pattern = sc.nextLine();                //Read Regex from user

        //Read the input string to check the match
        Pattern p = Pattern.compile(pattern);
        Matcher matcher = p.matcher(text);      //Create a matcher
            boolean found = false;
            while (matcher.find()) {
                //Print as: I found the text "j" starting at index 0 and ending at index 1.

                System.out.println("I found the text at starting at index " + matcher.start()+ " and ending at index " + matcher.end() );
            found = true;
            }
            if(!found){
            System.out.println("Cannot find text pattern");     //Print if matcher not found
            }

        }
    }
}
