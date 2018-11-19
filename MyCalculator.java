

public class MyCalculator {

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


}
