public class ShoppingCart {

    public static void main(String[] args) {

        //may be able to wrap all the divide code into a try 
        //exception is a variable 
        Calculator calc = new Calculator();
        int addResult = calc.add(43, 79);
        System.out.println("Add Result: " + addResult);


        try {
        double divResult = calc.divide(15, 0);
        System.out.println("Division Result: " + divResult);
        }
        catch (ArithmeticException exception)
        {
            System.out.println("Lol you cant do that!")
            exception.printStackTrace();
        }
        System.out.println("Finished the program");




    }
}
