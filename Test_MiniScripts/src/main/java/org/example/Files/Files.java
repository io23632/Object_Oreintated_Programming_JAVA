package org.example.Files;
import java.io.*;

public class Files {

    public static void main(String[] args) {

        String[] sqlCommands = {"SELECT", "INPUT", "FROM"};
       String myFile = "/home/io23632/.config/JetBrains/IntelliJIdea2023.2/scratches/CodingWithJohn.txt";
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(myFile));
            writer.write("Writing to a file");

            for (String sqlCommand : sqlCommands) {
                writer.write("\n");
                writer.write(sqlCommand);
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


//        try {
//            BufferedReader reader = new BufferedReader(new FileReader(myFile));
//            String lines;
//            while ((lines = reader.readLine()) != null) {
//                System.out.println(lines);
//            }
//            reader.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader(myFile));
            String lines = reader.readLine();
            while (lines != null) {
                System.out.println(lines);
                lines = reader.readLine();
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
