package apt;
import java.util.Scanner;
public class Check {
    public static void main(String[] args) 
    {
        System.out.print("Enter a Alphabet: ");
        Scanner sc =new Scanner(System.in);
        char c = sc.next().charAt(0);;
        switch (c) 
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(c + " is a vowel.");
                break;
            default:
                System.out.println(c + " is a consonant.");
        }
        sc.close();
    }
}
