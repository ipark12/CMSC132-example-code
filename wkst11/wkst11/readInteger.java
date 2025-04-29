package wkst11;
import java.util.*;

public class readInteger {
    public static int readInt() {
        //wowee its a scanner! reminds me of my high school coding days..
        Scanner s = new Scanner(System.in);
        
        boolean numberInputTrue = false;
        String input = s.next();
        
        //while loop will only run while boolean is false
        while (!numberInputTrue) {
            try {
                Integer.parseInt(input);
                //parsing worked, exit loop
                numberInputTrue = true;
            } catch (NumberFormatException e) {
                System.out.println("Not a number!");
                //get input again from scanner
                input = s.next();
            }
        }
        //always good practice to close the scanner after using it
        s.close();
        return Integer.parseInt(input);
    }
    public static void main(String[] args) {
        System.out.print(readInt());
    }
    
}
