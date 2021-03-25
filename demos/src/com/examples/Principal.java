package com.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

import com.examples.entidades.Alumno;
import com.examples.entidades.Asignatura;
import com.examples.entidades.CursoException;
import com.examples.entidades.Elemento;
import com.examples.entidades.Grafico;
import com.examples.entidades.Persona;
import com.examples.entidades.Profesor;
import static java.lang.Math.*;
/**
 * Primera clase de ejemplo
 * 
 * @author Javier
 *
 */
public class Principal {

	/**
	 * Método principal
	 * 
	 * @param args Linea de argumentos del comando
	 */
	public static void main(String[] args) {
//		try {
//			clases();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			System.exit(1);
//		}
//		Runtime.getRuntime().runFinalization();
//		// System.runFinalization();
//		System.gc();
//		Persona.dimeCuantos();
//		int i = abs(0);
//		i = Math.abs(0);
		lamda();
	}

	public static int micompare(String o1, String o2) {
		return -o1.compareTo(o2);
	}
	
	public static void lamda() {
		Comparator<String> comp;
		
		comp = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return -o1.compareTo(o2);
			}
		};
		
		Predicate<String> predicate = item -> Character.isUpperCase(item.charAt(0));
		
		comp = (a, b) -> -a.compareTo(b);
		
		List<String> lista = List.of("uno", "Dos", "Tres");
		lista = new ArrayList<>();
		lista.add("Uno");
		lista.add("dos");
		lista.add("Tres");
		lista.sort(comp);
		for(var item: lista)
			System.out.println(item);
		comp = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareToIgnoreCase(o2);
			}
		};
		lista.sort((a, b) -> a.compareToIgnoreCase(b));
		lista.sort(Principal::micompare);
		for(var item: lista)
			System.out.println(item);
		lista.forEach(System.out::println);
		lista.forEach(item -> System.out.println(item));
		
		System.out.println(lista.stream()
			.filter(item -> Character.isUpperCase(item.charAt(0)))
			.mapToInt(item -> item.length())
			.sum());
		
		Persona[] clase = { new Profesor(1, "Pepito", "Grillo"), new Alumno(2, "Carmelo", "Coton"),
				new Alumno(3, "Yo mismo") };
		Stream.of(new Profesor(1, "Pepito", "Grillo"), new Alumno(2, "Carmelo", "Coton"),
				new Alumno(3, "Yo mismo"))
			.filter(item -> item instanceof Alumno)
			.map(item -> (Alumno)item)
			.forEach(item -> System.out.println(item.getNombre()));;

			List<Integer> listOfIntegers = List.of(1, 2, 3, 7, 8, 4, 5, 6, 9);
			System.out.println("Sequential Stream: ");
			listOfIntegers.stream().peek(e -> System.out.print(e + " ")).map(i -> i * 2).sorted().forEach(e -> System.out.print(e + " "));
			System.out.println("\nParallel Stream: ");
			listOfIntegers.stream().parallel().map(i -> i * 2).sequential().sorted().forEach(e -> System.out.print(e + " "));
		
	}
	public static void genericos() {
		Elemento<Integer> provincia = new Elemento<Integer>(28, "Madrid");
		provincia.setKey(2);
		Elemento<Character> sexo = new Elemento<Character>('H', "Hombre");
		sexo.setKey('M');
		if (sexo instanceof Elemento) {

		}
		Object object = 4; // new Integer(4)
		int i = (int)object; // (Integer)object.get()
	}

	@Deprecated
	public static void clases() throws Exception {
		var p = new Principal();
		System.out.println(p.divide(3, 2));
		System.out.println(p.avg(3, 2));
		System.out.println(p.avg(3));
		System.out.println(p.avg(3, 2, 1, 4));
		p.pinta((float) 0.0);
		p.pinta("0");
		p.pinta(p.avg(3, 2, 1, 4, 5));

		Persona.dimeCuantos();
		Persona[] lista = { new Profesor(1, "Pepito", "Grillo"), new Alumno(2, "Carmelo", "Coton"),
				new Alumno(3, "Yo mismo") };
		try {
			Persona.dimeCuantos();
			for (var item : lista) {
				item.pintate();
			}
			lista[0].setNombre("Pepitoooooo");
		} catch (CursoException e) {
			// TODO Auto-generated catch block
			throw new Exception("Algo", e);
		}
		for (var item : lista) {
			item.comer();
			item.pintate();
		}
		((Alumno) lista[1]).duermete();
		System.out.println(lista[0]);
		System.out.println(lista[1]);

//		Asignatura asignatura;
//		asignatura.
//		var o = ((Alumno)lista[1]).dameAsignatura();
//		o.
		Grafico[] lista2 = { new Profesor(1, "Pepito", "Grillo"), new Alumno(2, "Carmelo", "Coton"),
				new Alumno(3, "Yo mismo"), new Asignatura() };
		for (var item : lista2) {
			item.pintate();
		}
		Object o = new Asignatura();
		o = new Principal();

		if (o instanceof Grafico) {
			((Grafico) o).pintate();
		}

	}

	public static void enumerado() {
		Genero g = Genero.MASCULINO;

		if (g == Genero.FEMENINO) {

		}

	}

	public static void tipos() {
		System.out.println("Hola mundo");
		long a = 0b1001_0011_1010_1111;
		var s = "12";
		var p = new Principal();
		List<String> list = new ArrayList<>();
		short c = (short) a;
		c = Short.parseShort(s);
		s = Short.toString(c);
		s = s + "3";

		int[] t = new int[10];
		int[][] m;
		m = new int[2][3];

		m = new int[2][];
		m[0] = new int[3];
		m[1] = new int[2];

		var aux = m[1];
		m[1] = m[0];
		m[0] = aux;
		s += "s";
		s = s + "s";
		if (s != null && s.length() > 0) {

		}
		if (a > c++) {

		}
		System.out.println("Elemento" + (c > 1 ? "s " : " "));

		Object object = new Principal();
		// ...
//		if(object instanceof Principal otra) {
//			// var otra = (Principal)object;
//			var r = otra.divide(2, 2);
//			((Principal)object).divide(2, 3);
//		}
		switch (c) {
		case 1:
		case 3:
		case 5:
			// ...
			break;
		case 2:
			// ...
			break;
		default:
			// ...
			break;
		case 6:
			// ...
			break;
		}
		s = switch (c) {
		case 1, 3, 5:
			// ...
			yield "uno";
		case 2:
			yield "dos";
		default:
			yield "muchos";
		};
		s = switch (c) {
		case 1, 3, 5 -> "uno";
		case 2 -> "dos";
		default -> "muchos";
		};

		for (int i = 0; i < t.length; i++) {
			a += t[i];
		}
		int i = 0;
		bucle: while (i < t.length) {
			switch (i++) {
			case 1:
			case 3:
			case 5:
				// ...
				break bucle;
			case 2:
				// ...
				continue bucle;
			default:
				// ...
				break;
			case 6:
				// ...
				break;
			}

			a += t[i - 1];
		}
		for (var item : t) {
			a += item;
		}
	}

	/**
	 * División real de dos números
	 * 
	 * @param a Primer operando
	 * @param b Segundo operando, no puede ser 0
	 * @return Resultado de la division real
	 * @throws ArithmeticException No se puede dividir por 0
	 */
	public double divide(double a, double b) throws ArithmeticException {
		if (b == 0)
			throw new ArithmeticException();
		return a / b;

	}

	private double avg(double primero, double... arg) {
		// if(arg.length == 0) return 0;
		// if(arg.length == 1) return arg[0];
		double acumulador = primero;
		for (var item : arg) {
			acumulador += item;
		}
		return acumulador / (arg.length + 1);
	}

	public void pinta(double primero) {
		if (primero == 0)
			return;
		System.out.println("El numero es " + primero);
	}

	public void pinta(float primero) {
		if (primero == 0)
			return;
		System.out.println("El numero es f" + primero);
	}

	public void pinta(String cad) {
		pinta(Double.parseDouble(cad));
	}

}
