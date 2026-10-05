package SESION;

public class Calculadora {

	public static int SUMA(int a, int b)
	{
		return a+b ; 
	}
	
	public static int RESTA(int a, int b)
	{
		return a-b ; 
	}
	
	public static int MULTIPLICA(int a, int b)
	{
		return a*b ; 
	}
	
	public static int DIVISION(int a, int b)
	{
		if (b != 0)
		{
			return a/b ; 
		}
		else
			return -1 ; 
	}
}
