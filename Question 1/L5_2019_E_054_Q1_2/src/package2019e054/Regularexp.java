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

            //1.2.1)Create the pattern (The beginning of a line "r", zero or more times & at the end of the line, "k")
            //String pattern = "^k(r*)$";

            //1.2.2)Create the pattern (a string that has vowels)
            //String pattern = "[aeiouAEIOU]";

            //1.2.3)Create the pattern (a string that has Email ID)
            String pattern = "[a-zA-Z0-9~!$%^&*\\-_=+}{'?.]+@[a-zA-Z.]+\\.[a-zA-Z]";

                                                    //Read the input string to check the match
            Pattern p = Pattern.compile(pattern);
            Matcher matcher = p.matcher(text);      //Create a matcher
                boolean found = false;
                while (matcher.find()) {
                    //Print as: I found the text "j" starting at index 0 and ending at index 1.

                    //System.out.println("I found the text, that has a k followed by zero or more r's at starting at index " + matcher.start()+ " and ending at index " + matcher.end() );
                    //System.out.println("I found vowel letter at index " + matcher.start() );
                    System.out.println("I found the text Email ID at starting at index " + matcher.start()+ " and ending at index " + matcher.end() );

                found = true;
                }
                if(!found){
                System.out.println("Cannot find text pattern");     //Print if matcher not found
                }

        }
    }
}
