package src.day6;

public class printException {

  public static void main(String[] args) {
    int[] numbers = {1, 2, 3};
    int result = 0;

    try {
      result = numbers[5];
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
