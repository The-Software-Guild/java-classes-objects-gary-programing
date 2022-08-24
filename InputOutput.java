import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class InputOutput {
    static File output = new File("output.txt");



    public static final String delimiter = "::";

    public static ArrayList<DVD> loadFile() throws IOException{
        Scanner scanner;
        output.createNewFile();
        scanner = new Scanner(new BufferedReader(new FileReader(output)));
        String currentline;
        ArrayList<DVD> collection = new ArrayList<DVD>();
        DVD dvd;
        while (scanner.hasNextLine()){
            currentline = scanner.nextLine();
            dvd = unmarshallDVD(currentline);
            collection.add(dvd);
        }
        scanner.close();
        return collection;
    }
    private static DVD unmarshallDVD(String dvdAsText) {
        String[] dvdTokens = dvdAsText.split(delimiter);
        DVD Ndvd = new DVD();
        Ndvd.addNewDVD( dvdTokens[0], dvdTokens[1], dvdTokens[2], dvdTokens[3], dvdTokens[4], dvdTokens[5]);
        return Ndvd;
    }
    private static String marshallDVD(DVD aDVD) {
        String dvdAsText = aDVD.getTitle() + delimiter;
        dvdAsText += aDVD.getDate() + delimiter;
        dvdAsText += aDVD.getMPAA() + delimiter;
        dvdAsText += aDVD.getDirectorsName() + delimiter;
        dvdAsText += aDVD.getStudio() + delimiter;
        dvdAsText += aDVD.getUser_review();
        return dvdAsText;
    }
    public static void writeToFile(ArrayList<DVD>collection) throws  IOException {
        PrintWriter out = null;
        try {
            out = new PrintWriter(new FileWriter(output));
        } catch (IOException e) {
            System.out.println("Could not save student data.");
        }

        String dvdAsText;
        for (DVD dvd : collection) {
            dvdAsText = marshallDVD(dvd);
            out.println(dvdAsText);
            out.flush();
        }
        out.close();
        loadFile();
    }
    }


