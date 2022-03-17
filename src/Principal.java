import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Principal {

	public static void main(String[] args) throws IOException {
		Operacion op;
		double n1, n2;
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		String x;
		do {
			System.out.println("Introduce el primer numero");
			n1 = Double.parseDouble(stdin.readLine());
			System.out.println("Introduce el segundo numero");
			n2 = Double.parseDouble(stdin.readLine());
			op = new Operacion(n1, n2);
			do {
			System.out.println("Introduce la operación que deseas realizar");
			System.out.println("Suma, Resta, multiplicacion, division, Potenciacion o raiz");
			x = stdin.readLine();
		
			switch (x.toLowerCase()) {
			case "suma":
				System.out.println(op.suma(op));
				break;
			case "resta":
				System.out.println(op.resta(op));
				break;
			case "multiplicacion":
				System.out.println(op.multiplicacion(op));
				break;
			case "division":
				System.out.println(op.division(op));
				break;
			case "potenciacion":
				System.out.println(op.potenciacion(op));
				break;
			case "raiz":
				System.out.println(op.raiz(op));
				break;
			default:
				System.out.println("Error");
				break;
				
			}
			System.out.println("¿Deseas hacer mas operaciones?(Cualquier tecla para continuar, NO para finalizar)");
			x=stdin.readLine();
			} while(x.equalsIgnoreCase("NO") == false);
			System.out.println("¿Deseas introducir otros numeros?(Cualquier tecla para continuar, NO para finalizar)");
			x=stdin.readLine();
		} while (x.equalsIgnoreCase("NO") == false);
	}
	}

