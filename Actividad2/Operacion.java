import org.hamcrest.Description;

public class Operacion {
  // atributos
  int numero1;
  int numero2;
  //metodo constructor 
  public Operacion(int numero1, int numero2) {
    this.numero1 = numero1;
    this.numero2 = numero2;
  }

  // metodos
  public int sumar(int numero1, int numero2) {
    int suma = numero1 + numero2;
    return suma;
  }

  public int restar(int numero1, int numero2) {
    int resta = numero1 - numero2;
    return resta;
  }

  public int multiplicar(int numero1, int numero2) {
    int multiplicacion = numero1 * numero2;
    return multiplicacion;
  }

  public double dividir(int numero1, int numero2) {
    double division = (double)numero1 / numero2;
    return division;
  }

  public void mostrarResultado(int suma, int resta, int multiplicacion, double division) {
    System.out.println("La suma es: " + suma);
    System.out.println("La resta es: " + resta);
    System.out.println("La multiplicacion es: " + multiplicacion);
    System.out.println("La division es: " + division);
  }
}