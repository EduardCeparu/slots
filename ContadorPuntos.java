package slots;

public class ContadorPuntos {

	/**
	 * 
	 * @param puntos pasas una variable entera...
	 * @return devuelve el valor total
	 * @author Eduard
	 */
	public static int cuentaPuntos(int puntos) {
		int valorFiguras = puntos;
		
		switch(valorFiguras) {
		case 1:
				valorFiguras+=2;
		break;
		case 2:
				valorFiguras+=2;
		break;
		case 3:
				valorFiguras+=2;
		break;
		case 4:
				valorFiguras+=3;
		break;
		case 5:
				valorFiguras+=3;
		break;
		case 6:
				valorFiguras+=3;
		break;
		case 7:
				valorFiguras+=3;
		break;
		case 8:
				valorFiguras+=5;
		break;
		case 9:
				valorFiguras+=10;
		break;
		}
		
		return valorFiguras;
	}
	
}
