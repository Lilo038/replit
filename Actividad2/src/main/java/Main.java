// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import javax.swing.JOptionPane;

public class Main {
  public static void main(String[] args) {
    int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número: "));
    int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número: "));

    Operacion op = new Operacion(numero1, numero2);
    int suma = op.sumar(numero1, numero2);
    int resta = op.restar(numero1, numero2);
    int multiplicacion = op.multiplicar(numero1, numero2);
    double division = op.dividir(numero1, numero2);

    op.mostrarResultado(suma, resta, multiplicacion, division);
    
    
  }

}