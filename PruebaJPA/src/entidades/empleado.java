package entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class empleado {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int identificador;
	private String nombre;
	private double salario;
	private String deg;
	
	public empleado() {
		super();
	}

	public empleado(int identificador, String nombre, double salario, String deg) {
		super();
		this.identificador = identificador;
		this.nombre = nombre;
		this.salario = salario;
		this.deg = deg;
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getDeg() {
		return deg;
	}

	public void setDeg(String deg) {
		this.deg = deg;
	}
	
	@Override
	public String toString() {
		return "Employee [identificador=" + identificador + ", ename=" + nombre + ", salary="
			      + salario + ", deg=" + deg + "]";
	}
	
}
