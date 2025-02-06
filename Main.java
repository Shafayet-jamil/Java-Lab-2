import java.util.Scanner;

import static java.util.Collections.reverse;


public class Main {
    //here is the assaign ment of the lab 2 all tasks
// ---------------------------------Task 01 -----------------------------------
//Write a program to accept a string and display its length using the length()
//method.
    static void task1calStringlen() {
        System.out.println("Enter the string to get the length of the string: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int len = s.length();
        System.out.println("This length of the string " + s + " is: " + len);
        sc.close();
    }
//     ------------------Task 02 --------------------------------------------
 //Accept a string and an index from the user. Print the character at the given
 //index using charAt().
     static void task2CharacterExtraction() {
         Scanner sc = new Scanner(System.in);

         System.out.println("Enter the string: ");
         String s = sc.nextLine();
         System.out.println("Enter the index number: ");
         byte index = sc.nextByte();
         char result = s.charAt(index);

         System.out.println("The "+index +"th char of "+ "''" + s+ "''" + " is: " + result);
         sc.close();
     }
//---------------------Task 03 --------------------------------------------------
//     Accept a string and print it in both uppercase and lowercase using
//toUpperCase() and toLowerCase().
static void task3calUpperLower() {
    System.out.println("Enter the string to get the upper, lower letters: ");
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();

    System.out.println("This uppercase of the string is: " + s.toUpperCase());
    System.out.println("This lowercase of the string is: " + s.toLowerCase());
    sc.close();
}
//------------------------------------Task 04 -----------------------------------------
//Write a program that extracts a substring from a string based on user-
//    provided start and end indices using substring().
    static void task4SubStrExtract() {
        System.out.println("Enter the string to extract the string: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("Enter the first index number: ");
       int firstIndex = sc.nextInt();
       System.out.println("Enter the last index number: ");
       int lastIndex = sc.nextInt();
       String result = s.substring(firstIndex, lastIndex);
       System.out.println("The extract string is:- " + result);
       sc.close();
    }

//    ----------------------------Task 05 --------------------------------------------
//Accept a string with leading or trailing spaces and display the trimmed
//    version using trim().
    //what does trim do? it only remove the first and the last spaces of the sentence
     static void task5trimSpace() {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter the string to trim the string: ");
        String one = sc.nextLine();
        String two  = one.trim();
         System.out.println("The trimed string is: " + two);
         sc.close();
     }


//     ------------------------------Task 06 --------------------------------------
//    Write a program that replaces all occurrences of a specific character with
//another character using replace().
    //replace the char with diatinaction char with replace mathod.....
    static void task6ReplaceChar() {
        System.out.println("Enter the string to replace the char of the string: ");
        Scanner sc = new Scanner(System.in);
        String one = sc.nextLine();

        System.out.println("The trimed string is: " + one.replace('a', '.'));
        sc.close();
    }
//    --------------------------Task 07 -----------------------------------------
//Write a program that accept two strings and compare them for equality using
//    equals() and equalsIgnoreCase().
   static void task7StringEquality() {
       System.out.println("Enter the first String to compare: ");
       Scanner sc = new Scanner(System.in);
       String one = sc.nextLine();
       System.out.println("Enter the second String to compare: ");
       String two = sc.nextLine();
       boolean ans = false;
       if(one.equals(two)) {
           ans = true;
       }
//       if(one.equalsIgnoreCase("how")){
//           ans = true;
//       }
      if(ans){
          System.out.println("The string are equal");
      }
      else{
          System.out.println("The string are not equal");
      }
        sc.close();
   }
//   -----------------------Task 08 ----------------------------------------
//Write a program that accept a string and a substring. Check if the main string
//    contains the substring using contains().

    static void task8Substring() {
        System.out.println("Enter the first String: ");
        Scanner sc = new Scanner(System.in);
        String one = sc.nextLine();
        System.out.println("Enter the second subString: ");
        String two = sc.nextLine();
        String result = one.contains(two) ? "Yes" : "No";
        System.out.println("The substring is: " + result);
    }

//---------------------------------Task 09 --------------------------------------
//Write a program to concatenate two strings using the concat() method and
//    the + operator. Compare the results.
    static void task9StringConcat() {
        System.out.println("Enter the first String to concat: ");
        Scanner sc = new Scanner(System.in);
        String one = sc.nextLine();
        System.out.println("Enter the second String to concat: ");
        String two = sc.nextLine();
        two = one.concat(two);
        System.out.println("The concat string is: " + two);

        sc.close();
    }

//    ------------------------Task 10 ------------------------------------
//    Accept a sentence and split it into words using split(). Print each word on a
//new line.
    static void task10SplitSentence() {
        System.out.println("Enter the String to split: ");
        Scanner sc = new Scanner(System.in);
        String one = sc.nextLine();
        //if we want to print specefic word,then we need to use indexNumber
//        String two = one.split(" ")[0];
//        System.out.println("The split string is: " + two);
//        use for loop to print the all words
        for(int i=0; i<one.length(); i++){
            String two = one.split(" ")[i];
            System.out.println(two);
        }

     sc.close();
    }

//    ---------------------------Task 11 ---------------------------------
//Write a program to find the first and last occurrence of a character in a string
//    using indexOf() and lastIndexOf().
    static void task11fastLastOcc() {
        System.out.println("Enter the String to split: ");
        Scanner sc = new Scanner(System.in);
        String one = sc.nextLine();
        int first = one.indexOf('a');

        int last = one.lastIndexOf('a');
        System.out.println("The first and last occurrence of the string is: "+ first+" "+ last);
    }
    // --------------------------Task 12 ----------------------------------
//    Write a program to reverse a string using a loop or StringBuilder.reverse().
   static void task12reverseStr() {
       System.out.println("Enter the String to reverse it: ");
       Scanner sc = new Scanner(System.in);
       String one = sc.nextLine();
       StringBuilder rev = new StringBuilder(one);

       rev.reverse();
       System.out.println("The reversed string is: " + rev);

   }
 //-------------------------------Task 15 --------------------------------
// Use String.format() to create a formatted string with placeholders. Example:
//            &quot;Hello, %s! You have %d new messages.&quot;
    static void task15FormateStr() {
        System.out.println("Enter the string to formate: ");
        Scanner sc = new Scanner(System.in);
        String one = sc.nextLine();
        int two = 4;
         String ans = String.format("Hello %s!", one, "You have %d words", two);
         String res = String.format("You have %d new massage", two);
        System.out.println(ans+res);
//        System.out.println("The ans is: "+ %s + "you have " +%d + " message");
    }


    public static void main(String[] args) {
//        task1calStringlen();
//        task2CharacterExtraction();
//        task3calUpperLower();
//        task4SubStrExtract();
//        task5trimSpace();
//        task6ReplaceChar();
//        task7StringEquality();
//        task8Substring();
//        task9StringConcat();
//        task10SplitSentence();
//         task11fastLastOcc();
//        task12reverseStr();
        task15FormateStr();
    }



}