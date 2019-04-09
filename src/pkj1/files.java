package pkj1;

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;


public class files {
    public void WriteFile(String fileName) {
        String line = "";
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Hello there,");
            bufferedWriter.newLine();
            bufferedWriter.write("hii aliii");
            bufferedWriter.close();
        } catch (Exception e) {
            System.out.println("No");
        }
    }

    public void OverWrite(String fileName) throws Exception {
        ArrayList<String> A = new ArrayList<String>();
        A = ReadFile(fileName);
        FileWriter fileWriter = new FileWriter(fileName);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        PrintWriter out = new PrintWriter(bufferedWriter);
        A.add("ahmed.3'reeb,haytham,hosni");
        System.out.println(A);

        A.forEach((s) -> out.print(s + "\n"));
        out.close();
    }


    public ArrayList ReadFile(String fileName) {
        ArrayList<String> A = new ArrayList<String>();

        String line = null;
        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader =
                    new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader =
                    new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
                int i = 0;
                String tmp[] = line.split("\n");

                A.add(tmp[i]);
                i++;
            }

            // Always close files.
            bufferedReader.close();

        } catch (Exception ex) {
            System.out.println(
                    "Unable to open file '" +
                            fileName + "'");
        }
        return A;
    }

    public void ReadFile1(String fileName) {
        ArrayList<String>[] A= new ArrayList[4];
        for (int i = 0; i < 4; i++) {
            A[i] = new ArrayList<String>();
        }
//        ArrayList<String> B = new ArrayList<String>();
//        ArrayList<String> C = new ArrayList<String>();
//        ArrayList<String> D = new ArrayList<String>();

        String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader =
                    new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader =
                    new BufferedReader(fileReader);
            //int j = 0;
            while ((line = bufferedReader.readLine()) != null) {

                String REGEX = "[.\n]+";
                Pattern pattern = Pattern.compile(REGEX);
                int limit = 0;
                String tmp[] = pattern.split(line,limit);

                for (int i = 0 , j =0; i < tmp.length; i++ ,j++) {
                    A[j].add(tmp[i]);
                }
//                A.add(tmp[i]);
//                B.add(tmp[i]);
//                C.add(tmp[i]);
//                D.add(tmp[i]);
      // j++;
            }

            // Always close files.
            bufferedReader.close();

        } catch (Exception ex) {
            System.out.println(
                    "Unable to open file '" +
                            fileName + "'");
        }
        for(int i = 0 ; i <4; i++)
        System.out.println("---A----"+A[i]);

    }
}