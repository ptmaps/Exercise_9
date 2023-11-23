import java.lang.reflect.Array;

public class ExceptionalHandlingExample {
    public static void main(String[]args){
        try{
            handleException(0);
        }catch (ArithmeticException e) {

           System.out.println("ArithmeticException caught: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("ArrayIndexOutOfBoudsExceptions caught: " + e.getMessage());
        }finally {
            System.out.println("Finally block executed.");
        }
    }

    public static void handleException(int value) {
        try{
            if (value == 0){
                throw new ArithmeticException("Cannot divide by zero.");
            }else if (value < 0) {
                throw new ArrayIndexOutOfBoundsException("Invalid array index.");
            }
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            throw e;
        }
    }
}
