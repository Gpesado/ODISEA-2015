package odisea;

public class Ciudad 
{
	Integer id;
	String Nombre;
	
	public Ciudad(Integer id, String nombre)
	{
		this.id = id;
		this.Nombre = nombre;
	}

		
	public String toString() 
	{
	return id + " " + Nombre + " ";
	}
}