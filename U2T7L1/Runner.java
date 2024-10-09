import java.util.Scanner;
public class Runner {
    public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter first string: ");
    String str1 = scan.nextLine();
    System.out.println("Enter second string: ");
    String str2 = scan.nextLine();
    if (str2.length() > str1.length()){
        System.out.println(str2 + " is longer");
    }else if (str2.length() < str1.length()){
        System.out.println(str1 + " is longer");
    }else{
        System.out.println("Both strings have the same length");
    }

    String str1l1 = str1.substring(0, str1.length() / 2);
    System.out.println("First half: "  + str1l1);
    String str1l2 = str1.substring(str1.length() / 2);
    System.out.println("Second half: "  + str1l2);
    String str2l1 = str2.substring(0, str2.length() / 2);
    System.out.println("First half: "  + str2l1);
    String str2l2 = str2.substring(str2.length() / 2 );
    System.out.println("Second half: "  + str2l2);
    if(str1.indexOf(str2) != -1){
        System.out.println(str2 +" is found in " + str1 + " at index " + str1.indexOf(str2) );
    }else{
        System.out.println(str2 + " is NOT found in " + str1);
    }
    scan.close();
    }
}
