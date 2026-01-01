package multicipher;
import java.util.Scanner;
public class MultiCipher {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("-----Cipher Tool-----\n");
        System.out.println("Enter 1 to select Ceaser, 2 to select XOR cipher: ");
        int cipherType=input.nextInt();
        System.out.println("Enter 1 to encrypt, 2 to decrypt the message: ");
        int taskType=input.nextInt();
        System.out.println("Enter the message: ");input.nextLine();
        String message=input.nextLine();
        System.out.println("Enter the key: ");
        int key=input.nextInt();
        switch (cipherType){
            case 1:
                if(validateInputCaesar(taskType,key,message)){
                    if(taskType==1){
                    System.out.println(" Encrypted message: "+encryptCaesar(message,key));
                    }
                    else{
                    System.out.println(" Decrypted message: "+decryptCaesar(message,key));
                    }
                }else{
                    System.out.println(" Invalid input.");
                }
                break;
            case 2:
                if(validateInputXOR(message,key)){
                    if(taskType==1){
                    System.out.println(" Encrypted message: "+cryptXOR(message, key));
                    }
                    else{
                    System.out.println(" Decrypted message: "+cryptXOR(message, key));
                    }
                }
                else{
                    System.out.println(" Invalid input.");
                }
        }
        
        input.close();
    }
    
    public static boolean validateInputCaesar(int taskType,int key,String message){
        if((taskType==1 || taskType==2) && message.length()!=0 && key>0){return true;}
        else{return false;}
    }
    
    public static String encryptCaesar(String message, int key){
        String encryptedMessage="";
        for (int i = 0; i < message.length() ; i++) {
            encryptedMessage= encryptedMessage + shiftCharCaesar(message.charAt(i),key);
        }
        return encryptedMessage;
    }
    
    public static String decryptCaesar(String message,int key){
        String decryptedMessage="";
        for (int i = 0; i < message.length(); i++) {
            decryptedMessage= decryptedMessage + shiftCharCaesar(message.charAt(i),-key);
        }
        return decryptedMessage;
    }
    
    public static char shiftCharCaesar(char ch,int key){
        if(Character.isLowerCase(ch)){
        return (char)('a' + (ch - 'a' + key % 26 + 26) % 26);
        }
        else if(Character.isUpperCase(ch)){
        return (char)('A'+ (ch - 'A' + key %26 + 26) % 26);
        }   
        else{
        return ch;
        }
    }
    
    public static boolean validateInputXOR(String message,int key){
        if((message.length()!=0) && key !=0){return true;}
        else{return false;}
    }
    
    public static String cryptXOR(String message,int key){
        String newMessage="";
        for (int i = 0; i < message.length() ; i++) {
            newMessage= newMessage + charXOR(message.charAt(i),key);
        }
        return newMessage;
    }
    
    public static char charXOR(char ch,int key){
    return (char) (ch ^ key);
    }
    
}
