package se.jensen.caws21.adventuredice;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        intro();

        //Looping through the menu
        loopMenu();


    }

    public static void intro() {
        System.out.println("\n");
        System.out.println("####----Hi and welcome to MovieDataBase---#### \n");
        System.out.println("Please make a choice from the menu");
    }


    public static void printMenu() {
        System.out.println("1. Look for movies");
        System.out.println("2. Genre");
        System.out.println("3. Add movies to the database");
        System.out.println("4. Rate movies");
        System.out.print("> ");
    }

    public static int menuChoice() {
        Scanner userInput = new Scanner(System.in);
        int scan = Integer.parseInt(userInput.nextLine());  // Tidigare skrivet = String scan = userInput.nextLine();
        return Integer.parseInt(String.valueOf(scan)); // Tidigare skrivet =  return Integer.parseInt(scan);
    }

    public static void loopMenu() {
        boolean runProgram = true;
        while (runProgram) {

            printMenu();
            int userPickedOption = menuChoice();
            switch (userPickedOption) {
                case 1:
                    System.out.println("PLease look for a movie \n");
                    break;
                case 2:
                    System.out.println("1. Horror");
                    System.out.println("2. Game");
                    break;
                case 3:
                    System.out.println("Please add movies to the database");
                    break;
                case 4:
                    System.out.println("Search the movie you want to rate");
                    break;
                default:
                    System.out.println("Error! Type in the correct menu choice");
            }

     /*public static void   ArrayList<String> cars = new ArrayList<String>() {
                System.out.println();
            }
 */
        }


    }
}


       /* ArrayList<String> mobilePhones = new ArrayList<String>(); //skapa en ArrayList objekt

        //Lägg till nu element du önskar att ha till listan
        mobilePhones.add("Samsung");
        mobilePhones.add("Huawei");
        mobilePhones.add("Iphone");
        mobilePhones.add("LG");

        for (int i = 0; i < mobilePhones.size(); i++) {
            System.out.println(mobilePhones.get(i));
        }


        */


