public class SwitchStatement {

    public static void main(String[] args) {
        int x = 7;

        /* switch statement supports "fall-through" logic ... 
        aka whichever case fulfills conditions will run as well as all other cases after the successful one */
        switch(x) {
            case 7: {
                System.out.println("case 7 ran");
                // break;
            }
            default:{
                System.out.println("The default case was breached!");
                // break;
            }
            case 21:{
                System.out.println("case 21 here");
                // break;
            }
            case 10:{
                System.out.println("case 10 wow you've reached the end");
                // break;
            }
        }
    }
}