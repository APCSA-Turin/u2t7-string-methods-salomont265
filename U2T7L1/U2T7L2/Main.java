
import java.util.Scanner;


public class Main {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int points = 0;
      String newWord;
      String prevWord;
      boolean gameOver = false;
      int wordCount = 0;
      System.out.println("Enter first word: ");
      newWord = scan.nextLine();
      while(gameOver != true){
         
         System.out.println("Enter next word: ");
         prevWord = newWord;
         newWord = scan.nextLine();
         wordCount++;
         if(newWord.length() == prevWord.length()){
            points += 4;
            System.out.println("+4 points: current word same length as previous; SCORE: " + points);

         }
         if (newWord.compareTo(prevWord) > 0){
            points += 2;
            System.out.println("+2 points: current word alphabetically after; SCORE: " + points);
         } 
         if (newWord.compareTo(prevWord) < 0){
            points -= 5;
            System.out.println("-5 points: current word alphabetically before; SCORE: " + points);
         } 
         if(newWord.compareTo(prevWord) == 0) {
            points -= 10;
            System.out.println("-10 points: current word is same as previous word; SCORE: " + points);  }

         if( prevWord.substring(prevWord.length() -2).equals(newWord.substring(0,2))){
            points += 5;
            System.out.println("+5 points: last 2 letters of previous match first 2 letter of current; SCORE: " + points);
         }

         if ((newWord.indexOf(prevWord.substring(0,1)) >= 0)){
            points += 3;
            System.out.println("+3 points: first letter of previous word found in current word; SCORE: " + points);
         }
         if(points >= 50){
            gameOver = true;
            System.out.println(" You win! It took you " +wordCount +" words! Try again for a high score!");
         }
      }
      scan.close();
   }
}
