import java.util.Scanner;

public class RotateNumber {

    
    public static int rotateNumber(int number, int rotateBy) {
        String numStr = String.valueOf(number);  
        int length = numStr.length();
        
        
        rotateBy = rotateBy % length;
        
       
        String rotated = numStr.substring(length - rotateBy) + numStr.substring(0, length - rotateBy);
        
        return Integer.parseInt(rotated);  
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        System.out.print("Enter the number of positions to rotate: ");
        int rotateBy = sc.nextInt();
        
        int rotatedNumber = rotateNumber(number, rotateBy);
        System.out.println("Rotated Number: " + rotatedNumber);
        
        sc.close();
    }
}


