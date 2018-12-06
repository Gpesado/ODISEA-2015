package odisea;

public class Test1 
{
	public static void main(String[] args) {
		Mapa m1 = new Mapa(3);
		m1.asignarNombre(0, "Troya");
		m1.asignarNombre(1, "Otra");
		m1.asignarNombre(2, "Itaca");
		m1.agDist(0, 1, 10, true);
		// distancia desde 0 hasta 1 es igual a 10
		m1.agDist(0, 2, 10, true);
		m1.agDist(1, 2, 10, true);
		
		
		System.out.println("camino minimo probable= " + m1.caminoMinimoProbable(0,0));
		System.out.println("distancia= " + m1.distancia(m1.caminoMinimoProbable(0,0)));

		}
}