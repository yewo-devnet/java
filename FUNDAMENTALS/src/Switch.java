public class Switch {
    public static void main(String [] args){

        char character = 'C';
        switch (character) {
            case 'A':
                System.out.println(character +  "available");
                break;
            case 'B':
                System.out.println(character + " available");
                break;
            case 'C':
                System.out.println(character + " available" );
                break;
            case 'D':
                System.out.println(character + " available");
                break;
            case 'E':
                System.out.println(character + " available");
                break;
            default :
                System.out.println("not available");
                break;
        }
    }
}

