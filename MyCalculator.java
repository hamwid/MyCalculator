import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.NumberFormatException;
import java.text.DecimalFormat;

public class MyCalculator {
  private static double  firstNumber;
  private static double  secondNumber;
  private static double  answer;
  private static String  operator;
  private static boolean continueLoop ;
  private static Scanner scan            = new Scanner(System.in);
  private static DecimalFormat precision = new DecimalFormat("#0.00");

  public static final String ANSI_CYAN  = "\u001B[36m";
  public static final String ANSI_RESET = "\u001B[0m";

  public MyCalculator(){
    reset();
  }

  private static void add(double d1, double d2){
    answer = d1 + d2;
  }
  private static void sub(double d1, double d2){
    answer = d1 - d2;
  }
  private static void mult(double d1, double d2){
    answer = d1 * d2;
  }
  private static void div(double d1, double d2){
    answer = d1 / d2;
  }

  public static void reset(){
    firstNumber     =    0;
    secondNumber    =    0;
    answer          =    0;
    operator        = "-1";
    continueLoop    = true;
  }

  private static void enterDouble(){
    System.out.print("Enter double: ");
    try {
      secondNumber = Double.parseDouble(scan.next());
    } catch (NumberFormatException e) {
      continueLoop = false;
    }
  }
  private static void enterOperator(){
    System.out.print("Enter operator (+, -, /, or *): ");
    operator = scan.next();
  }
  private static void printResult(){
    if(firstNumber != 0){
      System.out.println(ANSI_CYAN +
        precision.format(firstNumber) + " " + operator + " " +
        precision.format(secondNumber) + " = " +
        precision.format(answer) + ANSI_RESET);
    } else {
       System.out.println(ANSI_CYAN + precision.format(secondNumber)+ ANSI_RESET);
    }
  }
  private static void printInstructions(){
    System.out.println(
      "\nStep 1: Enter a double."+
      "\nStep 2: Enter an operator."+
      "\nStep 3: Enter a double."+
      "\nStep 4: Repeat steps 2 and 3."+
      "\nTerminate software by entering anything else at step 2 or step 3.");
  }

  //Methods used during test
  public double getFirstNumber(){
    return firstNumber;
  }
  public double getSecondNumber(){
    return secondNumber;
  }
  public double getAnswer(){
    return answer;
  }
  public String getOperator(){
    return operator;
  }
  public double callAdd(double d1, double d2){
    add(d1, d2);
    return answer;
  }
  public double callSub(double d1, double d2){
    sub(d1, d2);
    return answer;
  }
  public double callMult(double d1, double d2){
    mult(d1, d2);
    return answer;
  }
  public double callDiv(double d1, double d2){
    div(d1, d2);
    return answer;
  }

  public static void main(String[] args) {
    printInstructions();
    System.out.print("Enter double: ");
    try {
      firstNumber = Double.parseDouble(scan.next());
    } catch (NumberFormatException e) {
      continueLoop = false;
    }
    while (continueLoop) {
      enterOperator();
      if (( operator.equals("+") || operator.equals("-") ||
            operator.equals("*") || operator.equals("/") )){
        enterDouble();
      } else {
        continueLoop = false;
      }
      if (continueLoop){
        if (operator.equals("+")){
          add(firstNumber, secondNumber);
          printResult();
        } else if (operator.equals("-")){
          sub(firstNumber, secondNumber);
          printResult();
        } else if (operator.equals("*")){
          mult(firstNumber, secondNumber);
          printResult();
        } else if (operator.equals("/")){
          if (secondNumber != 0) {
            div(firstNumber, secondNumber);
            printResult();
          } else {
            System.out.println("Can not divide by zero!");
          }
        }
        firstNumber = answer;
      } else {
        continueLoop = false;
      } //End of if-statement dependping on continueLoop
    } //End of while-loop dependping on continueLoop
    scan.close();
    System.out.println("\nSoftware terminated!");
  }

}
