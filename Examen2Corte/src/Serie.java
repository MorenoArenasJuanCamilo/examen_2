
public class Serie implements Entregable {

	
	private final static int Numero_de_tempo = 3;
	public final static int Mayor = 1;
	public final static int Menor = -1;
	public final static int Igual = 0;

	
	private String titulo;
	private int numeroTemporadas;
	private boolean entregado;
	private String genero;
	private String creador;


	public String getTitulo () {
	    return titulo;
	}

	public void setTitulo (String titulo) {
	    this.titulo = titulo;
	}

	public int getnumeroTemporadas() {
	    return numeroTemporadas;
	}

	public void setnumeroTemporadas (int numeroTemporadas) {
	    this.numeroTemporadas = numeroTemporadas;
	}

	public String getGenero () {
	    return genero;
	}

	public void setGenero (String genero) {
	    this.genero = genero;
	}

	public String getcreador () {
	    return creador;
	}

	public void setcreador (String creador) {
	    this.creador = creador;
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


    public int compareTO(Object a) {
    	int lp=Menor;
		
    	Serie tir=(Serie)a;
    	if(numeroTemporadas>tir.getnumeroTemporadas()) {
    		lp=Mayor;
    	}else if(numeroTemporadas==tir.getnumeroTemporadas()) {
    		lp=Igual;
    	}
    	return lp;
    	
    	
    	
    }
    
    
    public String toString() {
    	return "Informacion serie. Titulo:"+titulo+" Numero de temporadas:"+numeroTemporadas+" Genero:"+genero+" Creador"+creador;
    }
    
    
    public boolean equals(Serie a) {
    	
    	if(titulo.equalsIgnoreCase(a.getTitulo()) && creador.equalsIgnoreCase(a.getcreador())) {
    		return true;
    	}
    	return false;
    }
  
    public Serie (){
	    this("",Numero_de_tempo, "", "");
	}

	public Serie (String titulo, String creador) {
	    this (titulo,Numero_de_tempo, "", creador);
	} 

	public Serie (String titulo, int numeroTemporadas, String genero, String creador) {
	    this.titulo = titulo;
	    this.numeroTemporadas = numeroTemporadas;
	    this.genero = genero;
	    this.creador = creador;
	    this.entregado = false;
	}

	
}
