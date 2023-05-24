import java.util.Scanner;

/*You are tasked with creating a program that validates a user's password based on a specific pattern. The pattern requires the password to meet the following criteria:
 
The password must be at least eight characters long.
The password must contain at least one uppercase letter.
The password must contain at least one lowercase letter.
The password must contain at least one digit.
The password must contain at least one special character from the set: !@#$%^&*()-_+=
*/
import java.util.Scanner;
public class Password{
    public static boolean validatePassword(String password) {
        if (password.length() < 8) {
            return false;
        }
 
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;
 
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
 
            if (ch >= 'A' && ch <= 'Z') {
                hasUppercase = true;
            } else if (ch >= 'a' && ch <= 'z') {
                hasLowercase = true;
            } else if (ch >= '0' && ch <= '9') {
                hasDigit = true;
            } else if (isSpecialChar(ch)) {
                hasSpecialChar = true;
            }
        }
 
        return hasUppercase && hasLowercase && hasDigit && hasSpecialChar;
    }
 
    private static boolean isSpecialChar(char ch) {
        // Define your own set of special characters here
        String specialChars = "!@#$%^&*()-_+=";
        return specialChars.indexOf(ch) != -1;
    }
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the password:");
        String password = sc.nextLine();
        boolean isValid = validatePassword(password);
        System.out.println("Is the password valid? " + isValid);
    }
}