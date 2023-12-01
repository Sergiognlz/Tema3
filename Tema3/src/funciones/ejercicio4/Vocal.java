package funciones.ejercicio4;



public class Vocal {
static public boolean vocal(char letra) {
	//declaramos booleano para saber si es vocal o no.
	boolean vocal=false;
	letra=Character.toLowerCase(letra);
	//creamos switch para recoger todos los caso. Las vocales y si no son vocales
	switch(letra){
	
	case 'a'->{
		vocal=true;
	}
	case 'e'->{
		vocal=true;
	}
	case 'i'->{
		vocal=true;
	}
	case 'o'->{
		vocal=true;
	}
	case 'u'->{
		vocal=true;
	}
	default->{
		vocal=false;
	}
	}
	
	return vocal;
}
}
