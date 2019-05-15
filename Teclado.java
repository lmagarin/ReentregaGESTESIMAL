/**
 * La clase teclado se encarga de pedir diferentes tipos de valores y asegurar que son 
 * los que queremos, devolver un error(valorNoValidoException).
 *   cuando no sea
 * @author d18sisaj
 *
 */
import java.util.Scanner;
public class Teclado {
  static Scanner s = new Scanner(System.in);
   
  /**
   * Lee cadenas
   * @return
   * @throws ValorInvalidoException 
   */
  public static String getString() throws ValorInvalidoException {
    String cadena;
    try {
      cadena=s.nextLine();
    } catch (Exception e) {
      throw new ValorInvalidoException();

    }
    return cadena;
   
  }
  /**
   * Muestra un mensaje y lee una cadena
   * @return
   * @throws ValorInvalidoException 
   */
  public static String getString(String mensaje) throws ValorInvalidoException {
    String cadena;
    System.out.println(mensaje);
    try {
      cadena=s.nextLine();
    } catch (Exception e) {
      throw new ValorInvalidoException();

    }
    return cadena;
   
  }
  /**
   * Lee enteros.
   * @return
   * @throws ValorInvalidoException 
   */
  public static int getInt() throws ValorInvalidoException {
    int number;
    try {
      number=Integer.parseInt(getString());
    }catch(Exception e) {
      throw new ValorInvalidoException();

    }
    return number;
    
  }
  /**
   * Muestra un mensaje y lee enteros
   * @param mensaje
   * @return
   * @throws ValorInvalidoException 
   */
  public static int getInt(String mensaje) throws ValorInvalidoException {
    int number;
    System.out.println(mensaje);
    try {
      number=Integer.parseInt(getString());
    }catch(Exception e) {
      throw new ValorInvalidoException();

    }
    return number;
    
  }
  /**
   * Lee numeros con decimales.
   * @return
   * @throws ValorInvalidoException 
   */
  public static double getDecimal() throws ValorInvalidoException {
    double number;
    try {
      number=Double.parseDouble(getString());
    }catch(Exception e) {
      throw new ValorInvalidoException();
    }
    return number;
  }
  /**
   * Muestra un mensaje y lee numeros decimales
   * @param mensaje
   * @return
   * @throws ValorInvalidoException 
   */
  public static double getDecimal(String mensaje) throws ValorInvalidoException {
    double number;
    System.out.println(mensaje);
    try {
      number=Double.parseDouble(getString());
    }catch(Exception e) {
      throw new ValorInvalidoException();

    }
    return number;
  }
  
  
  
}
