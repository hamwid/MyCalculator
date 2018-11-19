import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.NumberFormatException;
import java.text.DecimalFormat;

public class MyCalculator {
  private static double  firstNumber     =    0;
  private static double  secondNumber    =    0;
  private static double  answer          =    0;
  private static String  operator        = "-1";
  private static boolean continueLoop    = true;
  private static Scanner scan            = new Scanner(System.in);
  private static DecimalFormat precision = new DecimalFormat("#0.00");

  public static final String ANSI_CYAN  = "\u001B[36m";
  public static final String ANSI_RESET = "\u001B[0m";


}
