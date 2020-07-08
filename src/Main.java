import java.util.Scanner;

/**
 * Created by KPS on 7/8/2020.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a string");
        String message = scanner.nextLine();
        System.out.println("the reverse of message is : "+aktionOnMessage(message));

    }

    private static String aktionOnMessage(String message) {
        int countLetters=0,countSpace = 0 ,countNumber = 0,countOther=0;
        String result = "";
        for (int i = 0;i<=message.length()-1;i++){
            if (Character.isLetter(message.charAt(i))==true){countLetters++;}
            else if (Character.isDigit(message.charAt(i))==true){countNumber++;}
            else if (Character.isWhitespace(message.charAt(i))==true){countSpace++;}
            else {countOther++;}
        }
        result=String.format("letter: %d space: %d  number: %d other: %d",countLetters,countSpace,countNumber,countOther);
        return result;
    }
}
