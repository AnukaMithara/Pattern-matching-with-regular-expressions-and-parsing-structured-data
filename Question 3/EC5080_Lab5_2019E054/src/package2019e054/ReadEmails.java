// I certify the code of this lab is entirely my own work,
// but I received assistance from,
//https://stackoverflow.com/questions/52369327/how-to-read-data-from-all-files-one-by-one-in-a-folder-with-java
package package2019e054;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadEmails {

    // Method to read the file and return the content as a string
    public static String ReadFile(File file) throws IOException {

            String data = Files.readString(file.toPath());
            data.replace("\n", " ");

            return data;
    }
    //Method for extracting details from email containing .txt file
    public static String[] getDataFromEmail(String email) throws ArrayIndexOutOfBoundsException {

        //Patterns array for extracting the details from email
        String[] patterns = {"From: *[a-zA-Z\s]++",
                                "([a-z0-9_.-]+)@([a-z0-9_.-]+[a-zA-Z])",
                                "To: *[a-zA-Z\s]++",
                                "To: *[a-zA-Z\s]*< *([a-z0-9_.-]+)@eng.jfn.ac.lk",
                                "[a-zA-Z]+\s([0-9]+),\s([0-9]{4})+\s([0-9]{1,2}):([0-9]{1,2}):([0-9]{1,2})+\s([ampmAMPM]+)",
                                "[A-Z]+[0-9]{4}",
                                "lab *([0-9]+)",
                                "“*([a-zA-Z\s]++)*”"};

        String[] data = new String[patterns.length];
        String[] result = new String[9];

        //Loop for extracting the details from email
        for(int i = 0; i < patterns.length; i++) {
            Pattern p = Pattern.compile(patterns[i]);
            Matcher matcher = p.matcher(email);
            if(matcher.find()) {
               data[i] = matcher.group();
            }
        }
        //Assigning the extracted details to result array
        result[0]= data[0].substring(6);                //Sender name
        result[1]= data[1];                                      //Sender email
        result[2]= data[2].substring(4);                //Receiver name
        result[3]= data[3].split("< ")[1];                  //Receiver email
        result[4]= data[4];                                       //Date
        result[5]= data[5];                                       //Course code
        result[6]= data[5].substring(2,3);                        //Semester
        result[7]= data[6].substring(3);                //Lab
        result[8]= data[7].substring(1, data[7].length()-1);      //lab name

        return result;                                            //Return the result array
    }


    public static void main(String[] args) throws IOException {

        File folder = new File("Emails");          //Open Emails folder
        File[] listOfFiles = folder.listFiles();            //Get all files in the folder


        //Loop through all files in the folder
        for (File file : listOfFiles) {
            System.out.println("File name: " + file.getName());
            String Mail = ReadFile(file);
            String[] details = {"Sender Name : ","Sender Email : ","Receiver Name : ",
                    "Receiver Email : ","Date & time: ","Course Code : ","Semester : ",
                    "Lab no: ","Lab name : "};
            String[] data = getDataFromEmail(Mail);
            for(int i = 0; i < data.length; i++) {
                System.out.println(details[i] + data[i]);
            }
            System.out.println("------------------------------------------------------------");
        }
    }
}



