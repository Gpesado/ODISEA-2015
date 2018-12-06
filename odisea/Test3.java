package odisea;

import java.util.ArrayList;

public class Test3{
	public static void main(String[] args) 
	{
		Mapa m1 = new Mapa(14);
		

		m1.asignarNombre(0,"Troya");
		m1.asignarNombre(1,"IslaCicones");
		m1.asignarNombre(2,"IslaLotofagos");
		m1.asignarNombre(3,"IslaCiclopes");
		m1.asignarNombre(4,"IslaEolo");
		m1.asignarNombre(5,"IslaLestrigones");
		m1.asignarNombre(6,"IslaCirce");
		m1.asignarNombre(7,"EntradaInframundo");
		m1.asignarNombre(8,"IslaSirenas");
		m1.asignarNombre(9,"EscilayCaribdis");
		m1.asignarNombre(10,"IslaHelios");
		m1.asignarNombre(11,"IslaCalipso");
		m1.asignarNombre(12,"PaisFecianos");
		m1.asignarNombre(13,"Itaca");
				
				

		m1.agDist(0,1,50,true);
		m1.agDist(0,2,700,true);
		m1.agDist(0,3,800,true);
		m1.agDist(0,4,800,true);
		m1.agDist(0,5,900,true);
		m1.agDist(0,6,1100,true);
		m1.agDist(0,7,800,true);
		m1.agDist(0,8,800,true);
		m1.agDist(0,9,900,true);
		m1.agDist(0,10,720,true);
		m1.agDist(0,11,700,true);
		m1.agDist(0,12,500,true);
		m1.agDist(0,13,400,true);
		

		m1.agDist(1,2,800,true);
		m1.agDist(1,3,850,true);
		m1.agDist(1,4,900,true);
		m1.agDist(1,5,1000,true);
		m1.agDist(1,6,1200,true);
		m1.agDist(1,7,700,true);
		m1.agDist(1,8,500,true);
		m1.agDist(1,9,420,true);
		m1.agDist(1,10,500,true);
		m1.agDist(1,11,400,true);
		m1.agDist(1,12,250,true);
		m1.agDist(1,13,200,true);
		

		m1.agDist(2,3,200,true);
		m1.agDist(2,4,400,true);
		m1.agDist(2,5,500,true);
		m1.agDist(2,6,900,true);
		m1.agDist(2,7,750,true);
		m1.agDist(2,8,400,true);
		m1.agDist(2,9,300,true);
		m1.agDist(2,10,300,true);
		m1.agDist(2,11,200,true);
		m1.agDist(2,12,700,true);
		m1.agDist(2,13,600,true);
		

		m1.agDist(3,4,50,true);
		m1.agDist(3,5,200,true);
		m1.agDist(3,6,400,true);
		m1.agDist(3,7,300,true);
		m1.agDist(3,8,300,true);
		m1.agDist(3,9,200,true);
		m1.agDist(3,10,200,true);
		m1.agDist(3,11,300,true);
		m1.agDist(3,12,750,true);
		m1.agDist(3,13,700,true);
		

		m1.agDist(4,5,100,true);
		m1.agDist(4,6,200,true);
		m1.agDist(4,7,400,true);
		m1.agDist(4,8,450,true);
		m1.agDist(4,9,500,true);
		m1.agDist(4,10,650,true);
		m1.agDist(4,11,600,true);
		m1.agDist(4,12,720,true);
		m1.agDist(4,13,700,true);
				
		m1.agDist(5,6,100,true);
		m1.agDist(5,7,200,true);
		m1.agDist(5,8,300,true);
		m1.agDist(5,9,400,true);
		m1.agDist(5,10,420,true);
		m1.agDist(5,11,500,true);
		m1.agDist(5,12,600,true);
		m1.agDist(5,13,650,true);

		m1.agDist(6,7,300,true);
		m1.agDist(6,8,400,true);
		m1.agDist(6,9,500,true);
		m1.agDist(6,10,600,true);
		m1.agDist(6,11,800,true);
		m1.agDist(6,12,1000,true);
		m1.agDist(6,13,1200,true);


		m1.agDist(7,8,50,true);
		m1.agDist(7,9,100,true);
		m1.agDist(7,10,200,true);
		m1.agDist(7,11,250,true);
		m1.agDist(7,12,400,true);
		m1.agDist(7,13,450,true);

		m1.agDist(8,9,150,true);
		m1.agDist(8,10,300,true);
		m1.agDist(8,11,500,true);
		m1.agDist(8,12,600,true);
		m1.agDist(8,13,650,true);

		m1.agDist(9,10,100,true);
		m1.agDist(9,11,150,true);
		m1.agDist(9,12,300,true);
		m1.agDist(9,13,350,true);

		m1.agDist(10,11,100,true);
		m1.agDist(10,12,222,true);
		m1.agDist(10,13,250,true);

		m1.agDist(11,12,250,true);
		m1.agDist(11,13,300,true);

		m1.agDist(12,13,50,true);
		
		System.out.println("camino minimo probable= " + m1.caminoMinimoProbable(0,13));
		System.out.println("distancia= " + m1.distancia(m1.caminoMinimoProbable(0,13)));	
	}
}