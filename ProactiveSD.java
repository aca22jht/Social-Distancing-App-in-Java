//Done by: JASMINE HUI PING TAY

/* Personal Project on developing a social distancing app */
package com.company;

import java.util.Scanner; //For user input
import java.time.LocalDate; //For the current date later on
import java.time.LocalTime; //For the current time later on

class LocationDatabase {
    String LName[] = {"Library", "Cafeteria", "Lotus", "Core", "Radius", "Nexus"};
    String LID[] = {"L1", "L2", "L3", "L4", "L5"};
    int area;
    int capacity;
    double avgtime;

}

class SocialBubble extends ProactiveSD{ //Requirement: ProactiveSD inherits SocialBubble
    boolean status; //Casual Contact or NOT
    public static void MyStatus() {
        System.out.println("Status: Casual Contact");
    }
    public static void PersonName() {
        System.out.println("Name: Jasmine Hui Ping Tay");
    }
    public static void PersonID() {
        System.out.println("20297482");
    }
    public static void LocalDate(){
        LocalDate myObj = LocalDate.now(); //Create a date object
        System.out.println("Date: " + myObj);
    }
    public static void LocalTime() {
        LocalTime myObj = LocalTime.now();
        System.out.println("Time: " + myObj);
    }
}

class ProactiveSD {
    public static void main(String[] args){
        int people;


      LocationDatabase location1 = new LocationDatabase();

        Scanner myPlace = new Scanner(System.in);
        System.out.println("Which building would you like to enter?\n Choice 1: Library\n Choice 2: Core\n Choice 3: Cafeteria\n Choice 4: Radius\n Choice 5: Nexus\n");
        /* NOTE: Please enter the choice in accordance with what is displayed on the menu (e.g: Library). */
        System.out.println("Enter a building choice: ");

        String place = myPlace.nextLine();
        System.out.println("Choice Entered: " + place);

        switch(place){
            case "Library":
                location1.area = 25*35; //25*35 square feet
                location1.avgtime = 180; //every 3 hours (180 mins) only then switch a new batch of people
                location1.capacity = location1.area/(6*6); /*6*6 as in 6 feet length * 6 feet width, to get the capacity for the number of people allowed in the room,
                I type-casted the result of the capacity as the amount of humans present in the room with a 6 feet distance cannot be in float format Refer the line below.*/
                int cap = location1.capacity;

                System.out.println("Maximum allowed capacity: " + cap);
                System.out.println("Maximum time allowed per person: " + (int)location1.avgtime + " minutes"); //Shows the average time the user can spend in the particular building

                   //people = 50; //To test for the "exceeded capacity" part please remove the "//" from the "people = 50"
                    people = (int) Math.ceil(Math.random()); //Generate a random amount of people present
                    if (people >= 1 && people < cap) {
                        System.out.println("Welcome to the Library, please follow the proper protocols!\n");

                        Scanner distance = new Scanner(System.in);
                        System.out.println("Please input the distance from your neighbouring people \n" +
                                "in all four directions – North, South, East, West "); //Asking user input for the distance between his/her neighbours in the building

                        System.out.println("Distance from your North: ");
                        int North = distance.nextInt();
                        System.out.println("Distance from your South: ");
                        int South = distance.nextInt();
                        System.out.println("Distance from your East: ");
                        int East = distance.nextInt();
                        System.out.println("Distance from your West: ");
                        int West = distance.nextInt();

                        if (North == 6 && South == 6 && East == 6 && West == 6){
                            System.out.println("Thank you for maintaining social distancing! Have a pleasant experience!"); //Appreciation message
                        }
                        else{
                            SocialBubble p1 = new SocialBubble(); //class SocialBubble inherited by class ProactiveSD

                            p1.PersonName();
                            p1.PersonID();
                            System.out.println("Location Name: " + location1.LName[0]);
                            System.out.println("Location ID: " + location1.LID[0]);
                            p1.LocalDate();
                            p1.LocalTime();
                            p1.MyStatus();
                        }

                    }

                    else { //When room capacity exceeds the Maximum Capacity:
                        System.out.println("Room Capacity exceeded, would you like to come back in 2 minutes?"); //2 minutes is just a guinea pig data (assumption)
                        Scanner choice1 = new Scanner(System.in);

                        String decision = choice1.nextLine();

                        if(decision.equals("yes") || decision.equals("Yes")){
                            System.out.println("Welcome to the Library, please follow the proper protocols!\n");
                        }
                        else if(decision.equals("no") || decision.equals("No")){
                                System.out.println("Which building would you like to enter?\n Choice 1: Library\n Choice 2: Core\n Choice 3: Cafeteria\n Choice 4: Radius\n Choice 5: Nexus");

                                System.out.println("Enter a building choice: ");

                                String choice2 = myPlace.nextLine();
                                System.out.println("Choice Entered: " + choice2);

                                System.out.println("Welcome to the " + choice2 + "! Please follow the proper protocols!");
                        }
                        else{
                            System.out.println("Invalid input!"); //If the input is in the incorrect format then print an Invalid statement
                        }
                    }

                break;


            case "Core":
                location1.area = 35*45; //35*45 square feet
                location1.avgtime = 180; //every 3 hours (180 mins) only then switch a new batch of people
                location1.capacity = location1.area/(6*6); //6*6 as in 6 feet length * 6 feet width

                int cap1 = location1.capacity; //to type-cast the capacity as explained in the code for the previous room @Library

                System.out.println("Maximum allowed capacity: " + cap1);
                System.out.println("Maximum time allowed per person: " + (int)location1.avgtime + " minutes");

                //people = 50; //To test for the "exceeded capacity" part please remove the "//" from the "people = 50".
                people = (int) Math.ceil(Math.random());
                if (people >= 1 && people < cap1){
                    System.out.println("Welcome to the Library, please follow the proper protocols!\n");

                    Scanner distance = new Scanner(System.in);
                    System.out.println("Input the distance from your neighbouring people \n" +
                            "in all four directions – North, South, East, West ");

                    System.out.println("Distance from your North: ");
                    int North = distance.nextInt();
                    System.out.println("Distance from your South: ");
                    int South = distance.nextInt();
                    System.out.println("Distance from your East: ");
                    int East = distance.nextInt();
                    System.out.println("Distance from your West: ");
                    int West = distance.nextInt();

                    if (North == 6 && South == 6 && East == 6 && West == 6){
                        System.out.println("Thank you for maintaining social distancing! Have a pleasant experience!");
                    }
                    else{
                        SocialBubble p1 = new SocialBubble();

                        p1.PersonName();
                        p1.PersonID();
                        System.out.println("Location Name: " + location1.LName[0]);
                        System.out.println("Location ID: " + location1.LID[0]);
                        p1.LocalDate();
                        p1.LocalTime();
                        p1.MyStatus();
                    }

                }

                else {
                    System.out.println("Room Capacity exceeded, would you like to come back in 2 minutes?");
                    Scanner choice1 = new Scanner(System.in);

                    String decision = choice1.nextLine();

                    if(decision.equals("yes") || decision.equals("Yes")){
                        System.out.println("Welcome to the Core, please follow the proper protocols!");
                    }
                    else if(decision.equals("no") || decision.equals("No")){
                        System.out.println("Which building would you like to enter?\n Choice 1: Library\n Choice 2: Core\n Choice 3: Cafeteria\n Choice 4: Radius\n Choice 5: Nexus");

                        System.out.println("Enter a building choice: ");

                        String choice2 = myPlace.nextLine();
                        System.out.println("Choice Entered: " + choice2);

                        System.out.println("Welcome to the " + choice2 + "! Please follow the proper protocols!");
                    }
                    else{
                        System.out.println("Invalid input!");
                    }
                }

                break;

                 case "Cafeteria":
                     location1.area = 55*65; //55*65 square feet
                     location1.avgtime = 120; //every 2 hours (120 mins) only then switch a new batch of people
                     location1.capacity = location1.area/(6*6); //6*6 as in 6 feet length * 6 feet width because 6 feet social distancing

                     int cap2 = location1.capacity;

                     System.out.println("Maximum allowed capacity: " + cap2);
                     System.out.println("Maximum time allowed per person: " + (int)location1.avgtime + " minutes");

                     //people = 100; ////To test for the "exceeded capacity" part please remove the "//" from the "people = 100"
                     people = (int) Math.ceil(Math.random());
                     if (people >= 1 && people < location1.capacity) {
                         System.out.println("Welcome to the Cafeteria, please follow the proper protocols!\n");

                         Scanner distance = new Scanner(System.in);
                         System.out.println("Input the distance from your neighbouring people \n" +
                                 "in all four directions – North, South, East, West ");

                         System.out.println("Distance from your North: ");
                         int North = distance.nextInt();
                         System.out.println("Distance from your South: ");
                         int South = distance.nextInt();
                         System.out.println("Distance from your East: ");
                         int East = distance.nextInt();
                         System.out.println("Distance from your West: ");
                         int West = distance.nextInt();

                         if (North == 6 && South == 6 && East == 6 && West == 6){
                             System.out.println("Thank you for maintaining social distancing! Have a pleasant experience!");
                         }
                         else{
                             SocialBubble p1 = new SocialBubble();

                             p1.PersonName();
                             p1.PersonID();
                             System.out.println("Location Name: " + location1.LName[0]);
                             System.out.println("Location ID: " + location1.LID[0]);
                             p1.LocalDate();
                             p1.LocalTime();
                             p1.MyStatus();
                         }

                     }

                     else {
                         System.out.println("Room Capacity exceeded, would you like to come back in 2 minutes time?");
                         Scanner choice1 = new Scanner(System.in);

                         String decision = choice1.nextLine();

                         if(decision.equals("yes") || decision.equals("Yes")){
                             System.out.println("Welcome to the Cafeteria, please follow the proper protocols!");
                         }
                         else if(decision.equals("no") || decision.equals("No")){
                             System.out.println("Which building would you like to enter?\n Choice 1: Library\n Choice 2: Core\n Choice 3: Cafeteria\n Choice 4: Radius\n Choice 5: Nexus");

                             System.out.println("Enter a building choice: ");

                             String choice2 = myPlace.nextLine();
                             System.out.println("Choice Entered: " + choice2);

                             System.out.println("Welcome to the " + choice2 + "! Please follow the proper protocols!");
                         }
                         else{
                             System.out.println("Invalid input!");
                         }
                     }

                     break;


            case "Radius":
                location1.area = 25*35; //25*35 square feet
                location1.avgtime = 180; //every 3 hours (180 mins) only then switch a new batch of people
                location1.capacity = location1.area/(6*6); //6*6 as in 6 feet length * 6 feet width

                int cap3 = location1.capacity;

                System.out.println("Maximum allowed capacity: " + cap3);
                System.out.println("Maximum time allowed per person: " + (int)location1.avgtime + " minutes");
                //people = 35; //To test for the "exceeded capacity" part please remove the "//" from the "people = 35".

                people = (int) Math.ceil(Math.random());
                if (people >= 1 && people < cap3) {
                    System.out.println("Welcome to Radius, please follow the proper protocols!\n");

                    Scanner distance = new Scanner(System.in);
                    System.out.println("Input the distance from your neighbouring people \n" +
                            "in all four directions – North, South, East, West ");

                    System.out.println("Distance from your North: ");
                    int North = distance.nextInt();
                    System.out.println("Distance from your South: ");
                    int South = distance.nextInt();
                    System.out.println("Distance from your East: ");
                    int East = distance.nextInt();
                    System.out.println("Distance from your West: ");
                    int West = distance.nextInt();

                    if (North == 6 && South == 6 && East == 6 && West == 6){
                        System.out.println("Thank you for maintaining social distancing! Have a pleasant experience!");
                    }
                    else{
                        SocialBubble p1 = new SocialBubble();

                        p1.PersonName();
                        p1.PersonID();
                        System.out.println("Location Name: " + location1.LName[0]);
                        System.out.println("Location ID: " + location1.LID[0]);
                        p1.LocalDate();
                        p1.LocalTime();
                        p1.MyStatus();
                    }

                }

                else {
                    System.out.println("Room Capacity exceeded, would you like to come back in 2 minutes time?");
                    Scanner choice1 = new Scanner(System.in);

                    String decision = choice1.nextLine();

                    if(decision.equals("yes") || decision.equals("Yes")){
                        System.out.println("Welcome to Radius, please follow the proper protocols!");
                    }
                    else if(decision.equals("no") || decision.equals("No")){
                        System.out.println("Which building would you like to enter?\n Choice 1: Library\n Choice 2: Core\n Choice 3: Cafeteria\n Choice 4: Radius\n Choice 5: Nexus");

                        System.out.println("Enter a building choice: ");

                        String choice2 = myPlace.nextLine();
                        System.out.println("Choice Entered: " + choice2);

                        System.out.println("Welcome to the " + choice2 + "! Please follow the proper protocols!");
                    }
                    else{
                        System.out.println("Invalid input!");
                    }
                }

                break;

            case "Nexus":
                location1.area = 25*35; //25*35 square feet
                location1.avgtime = 180; //every 3 hours (180 mins) only then switch a new batch of people
                location1.capacity = location1.area/(6*6); //6*6 as in 6 feet length * 6 feet width

                int cap4 = location1.capacity;

                System.out.println("Maximum allowed capacity: " + cap4);
                System.out.println("Maximum time allowed per person: " + (int)location1.avgtime + " minutes");

                //people = 35; //To test for the "exceeded capacity" part please remove the "//" from the "people = 35"
                people = (int) Math.ceil(Math.random());
                if (people >= 1 && people < location1.capacity) {
                    System.out.println("Welcome to Nexus, please follow the proper protocols!\n");

                    Scanner distance = new Scanner(System.in);
                    System.out.println("Input the distance from your neighbouring people \n" +
                            "in all four directions – North, South, East, West ");

                    System.out.println("Distance from your North: ");
                    int North = distance.nextInt();
                    System.out.println("Distance from your South: ");
                    int South = distance.nextInt();
                    System.out.println("Distance from your East: ");
                    int East = distance.nextInt();
                    System.out.println("Distance from your West: ");
                    int West = distance.nextInt();

                    if (North == 6 && South == 6 && East == 6 && West == 6){
                        System.out.println("Thank you for maintaining social distancing! Have a pleasant experience!");
                    }
                    else{
                        SocialBubble p1 = new SocialBubble();

                        p1.PersonName();
                        p1.PersonID();
                        System.out.println("Location Name: " + location1.LName[0]);
                        System.out.println("Location ID: " + location1.LID[0]);
                        p1.LocalDate();
                        p1.LocalTime();
                        p1.MyStatus();
                    }

                }

                else {
                    System.out.println("Room Capacity exceeded, would you like to come back in 2 minutes time?");
                    Scanner choice1 = new Scanner(System.in);

                    String decision = choice1.nextLine();

                    if(decision.equals("yes") || decision.equals("Yes")){
                        System.out.println("Welcome to the Nexus, please follow the proper protocols!");
                    }
                    else if(decision.equals("no") || decision.equals("No")){
                        System.out.println("Which building would you like to enter?\n Choice 1: Library\n Choice 2: Core\n Choice 3: Cafeteria\n Choice 4: Radius\n Choice 5: Nexus");

                        System.out.println("Enter a building choice: ");

                        String choice2 = myPlace.nextLine();
                        System.out.println("Choice Entered: " + choice2);

                        System.out.println("Welcome to the " + choice2 + "! Please follow the proper protocols!");
                    }
                    else{
                        System.out.println("Invalid input!");
                    }
                }

                break;
        }
    }

}
