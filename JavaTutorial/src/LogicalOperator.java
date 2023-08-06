public class LogicalOperator {
    // || or
    // && and
    // ! not
    public static void main(String[] args) {

        int a= 3;
        int b= 4;
        boolean isSunny = false;
        boolean amHappy = false;


        if ((a < b && isSunny) || amHappy) {
            System.out.println("it's gonna be a good day");
            // They are both false so the code doesnt run.
        }



    }
}
