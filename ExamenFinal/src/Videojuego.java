


	public class Videojuego implements Entregable{

		private final static int Horas_estimadas = 100;
		public final static int Mayor = 1;
		public final static int Menor = -1;
		public final static int Igual = 0;

		

		private String titulo;
		private int horasEstimadas;
		private boolean entregado;
		private String genero;
		private String compañia;


		public String getTitulo () {
		    return titulo;
		}

		public void setTitulo (String titulo) {
		    this.titulo = titulo;
		}

		public int getHorasEstimadas () {
		    return horasEstimadas; 
		}

		public void setHorasEstimadas (int horasEstimadas) {
		    this.horasEstimadas = horasEstimadas;
		}

		public String getGenero () {
		    return genero;
		}

		public void setGenero (String genero) {
		    this.genero = genero;
		}

		public String getcompañia () {
		    return compañia;
		}

		public void setcompañia (String compañia) {
		    this.compañia = compañia;
		}

		public boolean entregar () {
		    return entregado = true;
		}

		public boolean devolver () {
		    return entregado = false;
		}

		public boolean isEntregado () {
		    if (entregado) {
		        return true;
		    }
		    return false;
		}


		public void compareTo (Object a) {
		    int estado = Menor;

		 
		    
		    Videojuego ref = (Videojuego) a;
		    if (horasEstimadas > ref.getHorasEstimadas ()) {
		        estado = Mayor;
		    }else if (horasEstimadas == ref.getHorasEstimadas ()) {
		        estado = Igual;
		    }

		   
		}

		public String toString () {
		    return "Informacion del videojuego: \n" +
		            "\tTitulo: "+titulo+"\n" +
		            "\tHoras estimadas: "+horasEstimadas+"\n" +
		            "\tGenero: "+genero+"\n" +
		            "\tcompañia: "+compañia;
		}

		public boolean equals (Videojuego a) {
		    if (titulo.equalsIgnoreCase (a.getTitulo ()) && compañia.equalsIgnoreCase(a.getcompañia ())) {
		        return true;
		    }
		    return false;
		}
		

		public Videojuego () {
		    this ("",Horas_estimadas, "", "");
		}

		public Videojuego (String titulo, String compañia) {
		    this (titulo, Horas_estimadas, "", compañia);
		}

		public Videojuego (String titulo, int horasEstimadas, String genero, String compañia) {
		    this.titulo = titulo;
		    this.horasEstimadas = horasEstimadas;
		    this.genero = genero;
		    this.compañia = compañia;
		    this.entregado = false;
		}
		

		
		
		
}
