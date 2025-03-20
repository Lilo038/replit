
import java.util.Random;

public class Main {
  public static void main(String[] args) {
    // Create Random object for generating random numbers
    Random random = new Random();

    int[] numbers = new int[500];
    int sum = 0;
    double average;

    // genera 500 numeros random entre 10 and 1000
    for (int i = 0; i < 500; i++) {
      numbers[i] = random.nextInt(991) + 10; // (1000-10)+1 = 991, empezando por 10
      sum += numbers[i]; // suma los numeros generados
    }

    // Calcula la media
    average = (double) sum / numbers.length;

    System.out.println("Suma total: " + sum);
    System.out.println("Promedio: " + average);
  }
}
