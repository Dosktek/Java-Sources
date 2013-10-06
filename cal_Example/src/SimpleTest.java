import java.io.*;

public class SimpleTest{

   static double operand1;
   static char operator;
   static  boolean isnum;
   static double result;
   static String calc = "45+45=";
   static String in = "";
   public static void main(String[] argv){

     SimpleCalculator calculator = new SimpleCalculator();


        while (calculator.c != '=')
        {
           in =  calculator.input(calc,operand1);
            calculator.parsevalue(operand1, in);
        }


         System.out.println(calculator.getResult());
        }

}

public String input(String calc, double operand1)
{
String in = "";
//66
//++2
        for (int i = 0; i < calc.length(); i++)
        {
        c = calc.charAt(i);
         String  characterString = Character.toString(c);
        if (Character.isDigit(calc.charAt(i)))
        {
         while (Character.isDigit(calc.charAt(i+1)))
         {
                characterString = characterString + Character.toString(calc.charAt(i+1));
                i++;
         }

        in = characterString;
        }
        parsevalue(operand1,in);

        }
return in;
}

  public void parsevalue(double operand1, String in)
  {

String characterString = in;
            try
            {

                setOperand(Double.parseDouble(characterString));

                   if (flag == 0)

                    {

                        operand1 = (Double.parseDouble(characterString));
                        result = operand1;
                        flag = 1;
                    }

                    getResult();

              }

            catch (Exception e)
            {
                try
                {
                    operator = c;
                }
                catch (Exception e2)
                {
                    System.out.println("Enter a number");
                }
            }
        }

   public void setOperator(char operator){
     this.operator = operator;
   }

   public char getOperator(){
     return operator;
   }

   public void setOperand(double operand){

      this.operand = operand;
   }

   public double getOperand(){

      return operand;
   }

    public double getResult(){

      if (getOperator() == '+')
          {
             result = (result + getOperand());
          }
             if (getOperator() == '-')
          {
             result = (result - getOperand());
          }
          if (getOperator() == '*')
          {
             result = (result * getOperand());
          }
          if (getOperator() == '/')
          {
             if (getOperand() == 0)
             {
                System.out.println("Cannot divide by zero");
             }
             result = (result / getOperand());
          }

          return result;
    }