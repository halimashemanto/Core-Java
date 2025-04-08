package createagamelikerockpaperseasor;

import java.util.Scanner;

public class CreateAGamelikeRockPaperSeasor {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

//         int computer = (int) (Math.random() * 3);
//        
//        System.out.println("choice Any one (0=ROCK, 1=PAPER, 2=Scissors)");
//        int userInput = s.nextInt();
//        String rock = s.next();
//        String paper = s.next();
//        String scissors = s.next();
//        
//        
//        System.out.println("Random Number is " + computer);
//        
//        if(userInput.equals(computer) ){
//            System.out.println(" Its a tie!");         
//        }
//        
//        else if (userInput.equals(rock)){
//            if(computer.equals(paper)){
//                  System.out.println(" You have chosen 'R0CK'& computer chosen 'PAPER' SO, COMPUTER WINNER.");
//            }
//          
//        }
//        
//        else if(userInput.equals(rock)){
//            if(computer.equals(scissors)){
//                  System.out.println(" You have chosen 'R0CK'& computer chosen 'scissors' SO, You are WINNER.");
//            }
//           
//        }
//         
//        else if(userInput.equals(paper)){
//            if(computer.equals(scissors)){
//                  System.out.println(" You have chosen 'PAPER'& computer chosen 'scissors' SO,COMPUTER WINNER.");
//            }
//           
//        }
//         else if(userInput.equals(paper)){
//            if(computer.equals(rock)){
//                  System.out.println(" You have chosen 'PAPER'& computer chosen 'rock' SO, R WINNER.");
//            }
//           
//        }
//      
//        else {
//            System.out.println(" SORRY !! YOUR GUSSES IS WRONG.");
//        }
        System.out.println(" enter A year");
        int year = s.nextInt();

        System.out.println(" enter Name of Month");
        int month = s.nextInt();
        String result="";
        
        switch(month) {
            case 1:
                result = "January";
                break;
            case 2:
                result = "February";
                break;
            case 3:
                result = "March";
                break;
            case 4:
                result = "April";
                break;
            case 5:
                result = "May";
                break;
            case 6:
                result = "June";
                break;
            case 7:
                result = "July";
                break;
            case 8:
                result = "August";
                break;
            case 9:
                result = "Septembar";
                break;
            case 10:
                result = "Octobar";
                break;
            case 11:
                result = "November";
                break;
            case 12:
                result = "Decembar";

                break;
            default:
                System.out.println("Out of Range");
        }

        System.out.println(" enter a date");
        String date = s.next();

        System.out.println( result+ " " + date + "," + year);
    }

}
