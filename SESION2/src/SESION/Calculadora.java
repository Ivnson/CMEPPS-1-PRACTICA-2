package SESION;

public class Calculadora {

	public int SUMA(int a, int b)
	{
		return a+b ; 
	}
	
	public int RESTA(int a, int b)
	{
		return a-b ; 
	}
	
	public int MULTIPLICA(int a, int b)
	{
		return a*b ; 
	}
	
	public int DIVISION(int a, int b)
	{
		if (b != 0)
		{
			return a/b ; 
		}
		else
			return -1 ; 
	}
}
