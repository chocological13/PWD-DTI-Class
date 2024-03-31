package src.leetcodePractice;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertTemp {

  public static void main(String[] args) {
    double celcius = 25.00;

    double[] temp = convertTemperature(celcius);
    System.out.println(Arrays.toString(temp));
  }

  public static double[] convertTemperature(double celcius) {
    // kelvin = celcius + 273.15
    // fahrenheit = celcius * 1.80 + 32.00

    double kelvin = celcius + 273.15;
    double fahrenheit = celcius * 1.80 + 32.00;

    return new double[]{kelvin, fahrenheit};
  }

}
