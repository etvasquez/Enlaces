package servicios;

import java.util.Scanner;

import entidades.empleado;

public class Main {
	public static void main(String[] args) {
		String bandera = "S";
		Scanner teclado = new Scanner(System.in);
		CRUDEmpledo ce = new CRUDEmpledo();/*
		do {
			
			System.out.println("Ingrese su nombre");
			String nombre = teclado.next();
			System.out.println("Ingrese su salario");
			Double salario = teclado.nextDouble();
			System.out.println("Ingrese su Departamento");
			String depar = teclado.next();
			empleado em = new empleado();
			em.setNombre(nombre);
			em.setSalario(salario);
			em.setDeg(depar);
			ce.CrearEmpleado(em);
			System.out.println("Desea ingresa otro empleado");
			bandera = teclado.next();
			System.out.println(bandera);
			
		} while(bandera.equals("N"));**/
		ce.PresentarEmpleados();
				
	}
}
