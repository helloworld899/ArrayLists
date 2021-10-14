package se.jensen.caws21.adventuredice;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        intro();
        menyVal();
        String scanUser = menuChoice();
        menyVal();
    }

        public static void intro () {
            System.out.println("\n");
            System.out.println("####----Hi and welcome to MovieDataBase---####");
            System.out.println("Please make a choice from the menu");
        }

        public static int menuChoice() {
            Scanner userInput = new Scanner (System.in);
            String scan = userInput.nextLine();
            return scan;
        }

        public static void printMenu() {
            System.out.println("1. Look for movies");
            System.out.println("2. Genre");
            System.out.println("3. Add movies to the database");
            System.out.println("4. Rate movies");
    }

        public static void loopMenu() {
        boolean runProgram = true;
         while (true) {
             printMenu();
             int userPickedOption = menuChoice();
         }

         public static add

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
    }


