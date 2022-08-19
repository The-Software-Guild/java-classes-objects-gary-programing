import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class MainApp {
    public static ArrayList<DVD> collection = new ArrayList<DVD>();

    public static void main(String[] args) {
        System.out.println("____Menu____");
        Scanner input = new Scanner(System.in);
        System.out.println("What would you like to do: \n1. add to the collection \n2. remove from the collection\n3. display the collection\n4. search the collection \n5. edit the collection\n0. Exit");
        String Choice = input.nextLine();
        boolean valid = true;
        while (valid) {
            switch (Choice) {
                case "1":
                    adding();
                    break;
                case "2":
                    removal();
                    break;
                case "3":
                    Display();
                    break;
                case "4":
                    search();
                    break;
                case "5":
                    edit();
                    break;
                case "0":
                    System.out.println("thanks for using the program");
                    valid = false;
                    break;
                default:
                    System.out.println("you entered an invalid input exiting program");
                    valid = false;

            }
        }
    }

    private static void edit() {
        System.out.println("\n ____edit____\n");
        DVD target = search();
        if (target == null){
            System.out.println("DvD not found");
        }else {
            target.edit();
            System.out.println(target.toString());
        }
    }

    private static DVD search() {
        System.out.println("\n____search____\n");
        Scanner target = new Scanner(System.in);
        System.out.println("what's the title of the dvd you would like to find");
        String Target = target.nextLine();
        for (DVD t : collection) {
            if (t.getTitle().equals(Target)) {
                System.out.println(t.toString());
                return t;
            }
        }
        return null;
    }

    private static void Display() {
        System.out.println("\n____Display____\n");
        for(DVD s : collection){
            System.out.println(s);
        }
    }

    public static void removal () {
        System.out.println("\n_____Removal____\n");
        Scanner inp = new Scanner(System.in);
        System.out.println("please enter the title of the movie you want removed: ");
        String targetTitle = inp.nextLine();
        System.out.println("please enter the Director of the movie: ");
        String targetDirector = inp.nextLine();
        for (Object t : collection) {
            DVD temp = (DVD) t;
            if (temp.getTitle().equals(targetTitle)  && temp.getTitle().equals(targetDirector)) {
                collection.remove(t);
            }
        }
    }

    public static void adding() {
        boolean valid = true;
        Scanner input = new Scanner(System.in);
        while (valid) {
            DVD dvd = new DVD();
            dvd.addNewDVD();
            collection.add(dvd);
            System.out.println("do you want to continue to add: \n 1. for yes: \n 2. for no");
            String yesNo = input.nextLine();
            if (yesNo == "1") {
                valid = true;
            } else {
                valid = false;
            }
        }




    }
}