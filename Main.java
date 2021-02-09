import java.util.Random;

class Main {
  public static void main(String[] args) {

    Random r = new Random();
    int randomNumber = r.nextInt(50) + 1;

    System.out.println("The Random number is: " + randomNumber);

    countDown(randomNumber);

    if (randomNumber <= 5) {
      System.out.println("Ahoy mateys");
    } else if (randomNumber < 42 && randomNumber > 25) {
      System.out.println("Cannonball!");
    } else {
      System.out.println("Blast off!");
    }
  }

  static void countDown(int theRandNum) {
      while(theRandNum != 0) {
        theRandNum--;
        System.out.println(theRandNum);
      }
  }
}
