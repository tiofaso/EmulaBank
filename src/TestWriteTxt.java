import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class TestWriteTxt {
    public static void main(String[] args) {

        String filePath = "src/testfile.txt"; //File path

        //Creating a txt file
       File theFile = new File(filePath);
       try{
           theFile.createNewFile();

           System.out.println("Arquivo criado: " + theFile.getName());

       }catch(IOException error){error.printStackTrace();}

       //Writing into on it
        try{
            FileWriter theFileWrite = new FileWriter(filePath);
            theFileWrite.write("Hello sumido! :D");
            theFileWrite.close();

            System.out.println("Dados escritos");
        }catch(IOException e){e.printStackTrace();}

        //Reading the file
        try{
            File theFileRead = new File(filePath);
            Scanner theReader = new Scanner(theFileRead);

            while (theReader.hasNextLine()){
                String infos = theReader.nextLine();
                System.out.println(infos);
            }

            theReader.close();
        }catch(FileNotFoundException error){error.printStackTrace();}
    }//end static


}
