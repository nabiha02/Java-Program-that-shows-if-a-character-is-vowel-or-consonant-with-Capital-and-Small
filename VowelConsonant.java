import java.util.Scanner;
public class VowelConsonant {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char ch;
        System.out.print("Enter your character:");
        ch = input.next().charAt(0);

       if(ch>='A' && ch<='Z'){
           System.out.print("The character is Capital");
           if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
               System.out.println(" & a Vowel");
           }
           else{
               System.out.println(" & also a Consonant");
           }
       }
       else{
           System.out.print("The character is Small");
           if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
               System.out.println(" & a Vowel");
           }
           else{
               System.out.println(" & also a Consonant");
           }
       }
    }

}
