
public class Ejecutar {

	
	public static void main(String[] args) {
	
		Serie ListaSeries[]= new Serie[5];
		Videojuego ListaVideojuegos[]=new Videojuego[5];
		
		
		ListaSeries[0]=new Serie();
		ListaSeries[1]=new Serie("la Casa de papel",5,"accion","lopez");
		ListaSeries[2]=new Serie("Dragon ball z",4,"Anime","Gomez");
		ListaSeries[3]=new Serie("Manifiesto",4,"Suspenso","Daniel");
		ListaSeries[4]=new Serie("breaking bad",3,"thiller","Camila");
		ListaSeries[5]=new Serie("Naruto",6,"Anime","Arenas");
		
		ListaVideojuegos[0]=new Videojuego();
		ListaVideojuegos[1]=new Videojuego("sekiro",15,"Accion","steam");
		ListaVideojuegos[2]=new Videojuego("leguea of legends",5,"RPG","Riot games");
		ListaVideojuegos[3]=new Videojuego("Valorant",20,"shooter","Riot games");
		ListaVideojuegos[4]=new Videojuego("Fifa",20,"Deportes","EA");
		ListaVideojuegos[5]=new Videojuego("Overwhact",13,"shooter","Battlenet");
		
		
		ListaSeries[1].entregar();
		ListaSeries[4].entregar();
		ListaSeries[5].entregar();
		ListaVideojuegos[3].entregar();
		ListaVideojuegos[4].entregar();
		ListaVideojuegos[5].entregar();
	
	
	int entregados = 0;

    for (int i = 0; i < ListaSeries.length; i++) {
        if (ListaSeries[i].isEntregado ()) {
            entregados += 1;
            ListaSeries[i].devolver ();

        }
        if (ListaVideojuegos[i].isEntregado ()) {
            entregados += 1;
            ListaVideojuegos[i].devolver ();
        }
    }

   System.out.println("Hay"+entregados+"entregadas");

   Serie serieMayor=ListaSeries[0];
   Videojuego videojuegoMayor=ListaVideojuegos[0];

   
   for(int i=1;i<ListaSeries.length;i++){
       if(ListaSeries[i].compareTo(serieMayor)==Serie.Mayor){
           serieMayor=ListaSeries[i];
       }
       if(ListaVideojuegos[i].compareTo(videojuegoMayor)==Videojuego.Mayor){
           videojuegoMayor=ListaVideojuegos[i];
       }

   }

   
   System.out.println(videojuegoMayor);
   System.out.println(serieMayor);
}

	
		
		
		
		
	}
	
}
