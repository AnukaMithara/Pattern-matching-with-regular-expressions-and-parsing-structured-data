# Pattern-matching-with-regular-expressions-and-parsing-structured-data
University of Jaffna: Faculty of Engineering : EC5080: Software Construction: Lab 5: Pattern matching with regular expressions, and parsing structured data

Question 01:
  1. Complete the following program by filling in the commented places. Implement it.
        //import necessary packages
        public class Regularexp {
        public static void main(String[] args){
        while (true) {
        //Read Regex from user
        //Create the pattern
        //Read the input string to check the match
        //Create a matcher
        boolean found = false;
        while (matcher.find()) {
        //Print as: I found the text "j" starting at index 0
        and ending at index 1.
        found = true;
        }
        if(!found){
        //Print
        }
        }
        }
        }

  2. Write the regex expressions for the following.
    i. Matches a string that has a k followed by zero or more r's.
    ii. Matches a string that has vowels.
    iii. Matches a string that has an emailID (any).
  3. Test the expressions you gave in the previous task (2.) by giving two or more sample input string.
  Paste the outputs.
  
Question 02.
You can use any IDE.
  1. Create an XML file & Add details of people.
  2. Write a program to print the person id, last name and first name from the XML file created in the
  previous task (1.) using Java DOM parser.
  3. Explain how you have appended or installed the necessary parser with your IDE.
  
Question 03
  1. First, create an IntelliJ Java project and name it as EC5080_Lab4_RegNo
  2. Starting at the topmost line of the file, insert the following under the comments. You need to
      choose one of them. If you get any assistance from anyone/book/internet please include that.
      Certificate of Authenticity: (choose one from below)
      // I certify the code of this lab is entirely my own work.
      (or)
      // I certify the code of this lab is entirely my own work,
      // but I received assistance from [insert name/site].
  4. Consider you have 10 emails (About different lab reschedules for different courses written by
    students to the instructors) saved in 10 files. The email body will differ in format. Sender
    emailID can be in any format and the receiver email ID is provided by the faculty. Implement a
    Java class FilterDetails to filter the details from the emails following the given steps from a toc.
  
      Sample email:
      From: Student name<emailID>
      Sent: Monday, September 26, 2022 4:28:38 PM
      To: Instructor name < emailID >
      Subject: Lab Reschedule
      Good morning, I’m writing this to request for a lab reschedule for EC5080. It is for lab
      04, “Pattern matching with regular expressions”.
      Thank you

        a. It has a method to read a file. (Includes necessary Exceptions).
        b. It has a method to filter and return the following details from an email. Sender name,
            Sender email ID, Receiver name, Receiver email ID, Email date, Course code,
            Semester, Lab no, and Lab name. You need to use the appropriate Java regular
            expressions and necessary String methods. E.g., you can't extract the email IDs
            considering the <…> symbols.
        c. It has a method to save the b.’s outputs of all emails in a file.
 
  
