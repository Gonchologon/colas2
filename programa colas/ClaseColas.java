package Colas;

public class ClaseColas {

	 
	      ///////////////////////////////////////////////////////////////////////////////////
		
			private int primero, ultimo;
			private Object[ ] info;
			/* M�todo Constructor � inicializa la fila */
			public ClaseColas(int n){
			primero = ultimo = n-1;
			info = new Object [n];
			}
			
		
		///////////////////////////////////////////////////////////////////////////////////
		
		
		public  void insert(Object elemento) {
			if (ultimo == info.length-1)
			ultimo = 0;
			else
			ultimo++;
			if (primero == ultimo) {
			System.out.println("Fila llena");
			ultimo--;
			}
			else
			info[ultimo] = elemento; //Agrega elemento al final de la fila
			}
	
		
		
      ///////////////////////////////////////////////////////////////////////////////////
		
		
		public Object retirar() {
			if (primero != ultimo) {
			if (primero == info.length-1)
			primero = 0;
			else
			primero++;
			return (info[primero]);
			}
			else {
			System.out.println("Fila vacia");
			return "";
			}
			}
		
		
		  ///////////////////////////////////////////////////////////////////////////////////
		
		
		
		public boolean isEmpty()
		{
		if (primero == ultimo)
		return true;
		else
		return false;
		}
		
		
	