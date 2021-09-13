import java.util.Scanner;

public class MyMain {

    // Given a String representing a binary number (e.g. "1010") as input,
    // and returns the decimal value of that number.
    // You can use Integer.parseInt() to convert a String into a **decimal** number.
    // Ex. binaryToDecimal("1010") => 10 (ten)
    //     binaryToDecimal("110010") => 50
    public static int binaryToDecimal(String binarystr) {
        // REPLACE WITH YOUR CODE
        int decsum = 0;
        for(int i=0;i <binarystr.length();i++){
            int binaryinteger = Integer.parseInt(String.valueOf(binarystr.charAt(i)));
            binaryinteger *= (int) Math.pow(2, (binarystr.length() - i - 1));
            decsum += binaryinteger;
        }
        return decsum;
    }

    // Given a decimal number (e.g. 152) as input, and returns a String
    // representing the binary representation of that number.
    // Ex. decimalToBinary(7) => "111"
    //     decimalToBinary(152) => "10011000"
    public static String decimalToBinary(int decimal) {
        // REPLACE WITH YOUR CODE
        StringBuilder decistring = new StringBuilder();
        if (decimal != 0) {
            while (decimal > 0) {
                decistring.append(decimal % 2);
                decimal /= 2;
            }
        }
        else{
            decistring.append(0);
        }
        return String.valueOf(decistring.reverse());
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // YOUR CODE HERE
    }
}
