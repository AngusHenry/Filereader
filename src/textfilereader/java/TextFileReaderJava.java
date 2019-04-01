/*
 * Angus Henry
 * 01/04/2019
 * This program will that will read files
 */

package textfilereader.java;
import java.io.*;
import javax.swing.JOptionPane;
public class TextFileReaderJava {


    public static void main(String[] args) throws IOException {
        Boolean check = true;
        String line = "";
        
     while (check == true){
         // ask for the file
          String file = JOptionPane.showInputDialog("Enter the file you want read. \n " 
        + "Example: ExampleFile.txt");
          // tryto find file
        try {
            BufferedReader readFile = new BufferedReader(
                    new FileReader(file));
            // output contents of the file
            System.out.println (file + ":");
                while((line = readFile.readLine()) != null){//EOF
            System.out.println(line);
        }
            check = false;
        } catch (FileNotFoundException ex) {
            // the file was not found, very sad
            System.out.println ("File not found, please try again");
        }
     }
     
    }
    }
    
