import java.util.Scanner;

public class DVD {
    private String Title;
    private String Date;
    private String MPAA;
    private String DirectorsName;
    private String Studio;
    private String User_review;

        public void addNewDVD() {
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
            System.out.println("which Studio created the movie: ");
            Studio = Input.nextLine();
            System.out.println("do you have a review for this movie? ");
            User_review = Input.nextLine();
        }
        public void addnewDvdImported(String one, String two, String three, String four, String five, String six){
            Title = one;
            Date = two;
            MPAA = three;
            DirectorsName = four;
            Studio = five;
            User_review = six;
        }
    public String toString(){
        return "Title: "+Title + " Date: "+ Date + " MPAA: " + MPAA + " Directors Name: " + DirectorsName + "Studio: "+ "User_review: " + User_review+ "\n";
    }

    public String getTitle() {
        return Title;
    }

    public String getDate() {
        return Date;
    }

    public String getStudio() {
        return Studio;
    }

    public String getMPAA() {
        return MPAA;
    }

    public String getUser_review() {
        return User_review;
    }

    public String getDirectorsName() {
        return DirectorsName;
    }
    public void edit(){
        Scanner INP = new Scanner(System.in);
        System.out.println("what would you like to edit: \n1. Title: \n2. Date: \n3.MPAA: \n4.Director: \n5.Studio: \n6.User Review:");
        String toBeEdited = INP.nextLine();
        switch (toBeEdited){
            case "1":
                System.out.println("what would you like to change it to: ");
                Title=INP.nextLine();
                break;
            case "2":
                System.out.println("what would you like to change it to: ");
                Date=INP.nextLine();
                break;
            case "3":
                System.out.println("what would you like to change it to: ");
                MPAA=INP.nextLine();
                break;
            case "4":
                System.out.println("what would you like to change it to: ");
                DirectorsName=INP.nextLine();
                break;
            case "5":
                System.out.println("what would you like to change it to: ");
                Studio=INP.nextLine();
                break;
            case "6":
                System.out.println("what would you like to change it to: ");
                User_review=INP.nextLine();
                break;
            default:
                System.out.println("invalid input");
                break;
        }


        }
}
