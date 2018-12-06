package odisea;

public class Test2 {
	public static void main(String[] args) {
		Mapa m1 = new Mapa(4);
		m1.asignarNombre(0,"Troya");
		m1.asignarNombre(1,"Otra1");
		m1.asignarNombre(2,"Otra2");
		m1.asignarNombre(3, "Itaca");

		m1.agDist(0,1,10,true);
		m1.agDist(0,2,10,true);
		m1.agDist(0,3,15,true);
		m1.agDist(1,2,15,true);
		m1.agDist(1,3,10,true);
		m1.agDist(2,3,10,true);
				
		System.out.println("camino minimo probable= " + m1.caminoMinimoProbable(0,3));
		System.out.println("distancia= " + m1.distancia(m1.caminoMinimoProbable(0,3)));
		}
}