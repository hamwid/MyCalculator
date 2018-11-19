

public class MyCalculator {


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
