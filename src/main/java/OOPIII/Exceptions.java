package OOPIII;

/* This class shows the use of Exception:

  Try - catch
  throw and throws
  catch multiple exceptions
  try with resources
  Annotations

 */

class Exceptions {

    public static void main(String[] args) {

        try {
            int remainder = 5 / 0;
            System.out.println("Rest of code follows");
        } catch (ArithmeticException e ){
            System.out.println("Arithmetic Exception => " + e.getMessage());
        } /* finally {
            System.out.println("The finally block is always executed");
        } */



    }
}

class Numbers {
    private int[] nums = new int[10];

    public Numbers() {
        for (int i = 0; i < 10; i++) {
            nums[i] = i;
        }
    }
}
