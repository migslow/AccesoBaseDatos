/* 
 * Interfaz funcional cuya función abstracta salude al objeto que se le pase como parámetro
 */
package _01InterfacesFuncionalesyExpresionesLambda;

public class Saludar1 {

	public static void main(String[] args) {
		Saludo<String> saludoNombres = s -> "¡Hola " + s +"!";
		System.out.println(saludoNombres.saludar("Alberto"));
		System.out.println(saludoNombres.saludar("Luis"));
		//
		Saludo<Cliente> saludoCliente= s -> "¡Hola " + s.getNombre() +"!";
		System.out.println(saludoCliente.saludar(new Cliente("111", "Marta")));

	}

}
