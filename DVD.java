import java.util.ArrayList;
import java.util.Scanner;

public class DVD {
    private String Title;
    private String Date;
    private String MPAA;
    private String DirectorsName;
    private String User_review;

    public static void main(String[] args) {
        ArrayList<DVD> collection = new ArrayList<DVD>();
        DVD dvd = new DVD();
        for (int i = 0 ; i <3 ; i++) {
            dvd.addNewDVD();
            collection.add(dvd);
            System.out.println(dvd.toString());
        }
        for(DVD s : collection){
            System.out.println(s);
        }
    }

    private void addNewDVD() {
        System.out.println("\n ____ADDING____ \n");
        Scanner Input = new Scanner(System.in);
        System.out.println("please enter the title of the film: ");
        Title = Input.nextLine();
        System.out.println("please enter the Date it was released: ");
        Date = Input.nextLine();
        System.out.println("Please enter the MPAA Rating: ");
        MPAA = Input.nextLine();
        System.out.println("please enter who directed this movie: ");
        DirectorsName = Input.nextLine();
        System.out.println("do you have a review for this movie? ");
        User_review = Input.nextLine();

    }
    public String toString(){
        return "Title: "+Title + " Date: "+ Date + " MPAA: " + MPAA + " Directors Name: " + DirectorsName + " User_review: " + User_review+"\n";
    }


}
