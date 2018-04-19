package paquete;

public class Carro {
	float peso;
	float velocidad;
	float largo;
	int numeroPuertas;
	boolean encendido;
	String modelo;

public Carro()
{
	this.peso=400;
	this.velocidad=100;
	this.largo=2;
	this.numeroPuertas=4;
	this.encendido=false;
	this.modelo="ABC";
}
public Carro(float peso, float velocidad, float largo, int numeroPuertas, boolean encendido, String modelo)
{
	this.peso=peso;
	this.velocidad=velocidad;
	this.largo=largo;
	this.numeroPuertas=numeroPuertas;
	this.encendido=encendido;
	this.modelo=modelo;
}
public void Encender()
{
	encendido=true;
	System.out.println("El carro se ha encendido");
}
public void informacion()
{
	System.out.println("Es un carro ABC");
}
}
class CarroBMW extends Carro
{
	public CarroBMW()
	{
		this.modelo="BMW";
	}
	public void informacion()
	{
		System.out.println("Es un carro BMW");
	}
	public void turbo()
	{
		System.out.println("Va a 100 km por hora");
	}
}
