public class Calculation 
{
    public int add(int number1, int number2){
        return number1 + number2;
    }
    
    public int subtract(int number1, int number2){
        return number1 - number2;
    }
    
    public int multiply(int number1, int number2){
        return number1 * number2;
    }
    
    public double divide(int number1, int number2){
        if(number2 != 0){
           return (double) number1 / (double) number2;
        }
        else{            
            System.out.println("Please enter a number greater or smaller than zero");   
            return(0);
        }
    }
    
}
