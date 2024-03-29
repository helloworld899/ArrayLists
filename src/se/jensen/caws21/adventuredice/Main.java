package se.jensen.caws21.adventuredice;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.HashMap;

public class Main {
    static ArrayList<String> movieList = new ArrayList<String>();
    static ArrayList<String> genreList = new ArrayList<String>();
    static HashMap<String, String> genre = new HashMap<String, String>();


    public static void main(String[] args) {

        //This method will print the intro
        intro();


        //Looping through the menu
        boolean runProgram = true;
        while (runProgram) {

            printMenu();
            int userPickedOption = getUserInt(); //Datatyp int för att användaren ska välja menyer med siffror
            switch (userPickedOption) {
                case 1:
                    System.out.println("Please add movies & genre");
                    System.out.print("> ");
                    movieList.add(getUserString()); //Användaren får skriva in input

                    System.out.println("What genre does the movie have?");
                    System.out.print("> ");
                    genreList.add(getUserString());
                    break;
                case 2:
                    for (String j : genreList) {
                        System.out.println(j);
                    }
                    System.out.println("Find movies that belong within same genre");
                    System.out.print("> ");
                    System.out.println(movieList.get(Integer.parseInt(getUserString())));

                    break;
                case 3:
                    System.out.println("######---ALL MOVIES IN THE DATABASE---#######");
                    Collections.sort(movieList); //M.h.a. klassen Collections kan man sortera listan alfabetiskt
                    int counter = 1; // med counter kan vi få listan numrerad.
                    for (String i : movieList) { //Här inhämtas all data som användaren skrivit in.
                        System.out.println(counter + ". "+ i);
                        counter++;
                    }
                    break;
                case 4:
                    System.out.println("Search the movie you want to rate");
                    break;
                case 5:
                    System.out.println("Make changes in the list");

                    break;
                case 6:
                    System.out.println("What movie do you want to remove?");
                    movieList.remove(getUserString());
                    break;
                case 7:
                    runProgram = false;
                    System.out.println("Program has ended");
                    break;
                default:
                    System.out.println("Error! Type in the correct menu choice");

            }

        }


    }

    public static void intro() {
        System.out.println("\n");
        System.out.println("####----Hi and welcome to MovieDataBase---#### \n");
        System.out.println("Please make a choice from the menu");
    }


    public static void printMenu() {
        System.out.println("1. Add movies & genre to the database");
        System.out.println("2. Genre");
        System.out.println("3. All movies");
        System.out.println("4. Rate movies");
        System.out.println("5. Change the movielist ");
        System.out.println("6. Remove a movie/genre from the list");
        System.out.println("7. Quit program");
        System.out.print("> ");
    }

    //Scanner metod = Här används Integer/String.valueOf() metoden
    public static int getUserInt() {
        Scanner userInput = new Scanner(System.in);
        int scan;

        scan = Integer.parseInt(userInput.nextLine());  // Tidigare skrivet = String scan = userInput.nextLine();
        return Integer.parseInt(String.valueOf(scan)); // Tidigare skrivet =  return Integer.parseInt(scan);
    }

    // Metod som returnerar en Scanner String
    public static String getUserString() {
        Scanner userInput2 = new Scanner(System.in);
        String s = userInput2.nextLine(); // IntelliJ tipsar istället: return userInput2.nextLine();
        return s;
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



