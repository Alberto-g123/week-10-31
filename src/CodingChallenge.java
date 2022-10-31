import java.lang.reflect.Method;
import java.util.Scanner;

public class CodingChallenge {


    public static String atbashCipher(String string){
        String cipher = "";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for(int i = 0; i < string.length(); i++){
            char letter = string.charAt(i);
            char blank = ' ';
            if(letter == blank) {
                cipher += " ";
            }else if(Character.isLetter(letter) == false){
                cipher += String.valueOf(letter);
            }else{
            for(int x = 0; x < alphabet.length(); x++){
                if(letter == blank){
                    cipher += " ";
                }else if(Character.isUpperCase(letter)){
                    if(letter == alphabet.toUpperCase().charAt(x)){
                        cipher += alphabet.toUpperCase().charAt(25 - x);
                    }
                }else if(Character.isLowerCase(letter)){
                    if(letter == alphabet.charAt(x)){
                        cipher += alphabet.charAt(25 - x);
                    }
                }

            }}
        }
        return cipher;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String string = sc.nextLine();
        System.out.println(atbashCipher(string));
    }
}
