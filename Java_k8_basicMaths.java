public class BasicOperations
{
  public static Integer basicMath(String op, int v1, int v2) {
  int output = 0;

  if (op.equals("+")) {
    output = v1+v2;
  }
  if (op.equals("-")) {
    output = v1-v2;
  }
  if (op.equals("*")) {
    output = v1*v2;
  }
  if (op.equals("/")) {
  output = v1/v2;
  }
  return output;
  }
}
