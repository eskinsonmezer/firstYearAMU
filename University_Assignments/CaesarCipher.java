import java.util.Scanner;
public class CaesarCipher {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Caser Cipher Tool\n Enter 1 to encrypt,2 to decrypt the message:");
        int task=input.nextInt();
        System.out.println(" Enter the message: ");input.nextLine();String message= input.nextLine(); 
        System.out.println(" Enter the key: ");int key=input.nextInt();
        if(validateInput(task,message,key)){
            if(task==1){
                System.out.println("Encrypted message: "+encrypt(message,key));
            }else{
                System.out.println("Decrypted message: "+decrypt(message,key));
            }
        }else{
            System.out.println("Your input is not valid.");
        }
        input.close();
    }

    public static boolean validateInput(int taskType, String message, int key){
        if(key>0 && (taskType==1 || taskType==2) && (message.length() != 0)){
            return true;
        }
        else{
            return false;
        }
    }

    public static String encrypt(String message, int key){
        String encryptedMessage="";
        for (int i = 0; i < message.length(); i++) {
            char x=message.charAt(i);
            encryptedMessage = encryptedMessage + shiftChar(x,key);
        }
        return encryptedMessage;
    }

    public static String decrypt(String message, int key){
        String decryptedMessage="";
        for (int i = 0; i < message.length(); i++) {
            char x=message.charAt(i);
            decryptedMessage = decryptedMessage + shiftChar(x,-key);
        }
        return decryptedMessage;
    }

    public static char shiftChar(char ch, int x){
        if(Character.isLowerCase(ch)){
            return (char)('a'+(ch-'a'+x%26+26)%26);
        }
        else if(Character.isUpperCase(ch)){
            return (char)('A'+(ch-'A'+x%26+26)%26);
        }
        return ch;
    }
}
