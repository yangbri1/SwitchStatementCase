/* practice switch statements in Java */

public class SwitchStatement {

    public static void main(String[] args) {
        // assign variable x with value of int 9
        int x = 10;

        /* switch statement supports "fall-through" logic ... 
        aka whichever case fulfills conditions will run as well as all other cases after the successful one */
        switch(x) {
            case 7: {
                System.out.println("case 7 ran");
                break;
            }
            // default case if other conditions are NOT met (normally placement is at the caboose of all the cases)
            default:{
                System.out.println("The default case was breached!");
                break;
            }
            case 21:{
                System.out.println("case 21 here");
                break;
            }
            case 10:{
                System.out.println("case 10 wow you've reached the end");
                // break;   
                /* technically since this is the last case 
                --- 'break' statement is NOT needed as even if this case is not hit
                there aren't any other cases afterwards */
            }
        }
    }
}