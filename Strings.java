import java.util.*;

public class Strings {
  public static void main(String args[]) {
/* 
    // Declaration
    String myName = "Tushar";
    System.out.println(myName);

    //Taking Input
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();


    //concatenation [Joining two String]
    String firstName = "Tony";
    String lastName = "Stark";
    String fullName = firstName + " "+ lastName;
    System.out.println(fullName);

    //length
    System.out.println(fullName.length());


    //Access charecters of a String
    String name = "Jacqueline";
    System.out.print(name.charAt(3));


    // String function compare
    String s1 = "Tony";
    String s2 = "Tony";
    String s3 = new String("Tony");

    if (s1 == s2) {
      System.out.println("Strings are equal");
    } else {
      System.out.println("Strings are not equal");
    }

    // Equals
    if (s1.equals(s3)) {
      System.out.println("Strings are equal");
    } else {
      System.out.println("Strings are not equal");
    }

    // subString
    String str = "HelloWorld";
    System.out.println(str.substring(0, 5));


*/
    //Declaration
    StringBuilder sb = new StringBuilder("");
    for(char ch='a'; ch<='z'; ch++) {
      sb.append(ch);
    }
    System.out.println(sb);
    System.out.println(sb.length());
  }
}