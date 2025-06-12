package uniandes.cupi2.videotienda.mundo;


/**
 * Esta clase representa una copia de la película que se encuentra en la videotienda 
 */ 
public class Copia {
	
	 //-----------------------------------------------------------------
    // Atributos
	/**
	 * Titulo de la copia de la película
	 */
	private String tituloPelicula;
	
    //-----------------------------------------------------------------

    /**
     * Código de la copia
     */
	private int codigo;
	
	
	//-----------------------------------------------------------------
    // Constructores
    //-----------------------------------------------------------------

    /**
     * Crea una nueva copia de una película.
     * @param elCodigo Código de la copia. elCodigo > 0.
     * @param laPelicula Título de la película. laPelicula != null.
     */
	public Copia( String laPelicula, int elCodigo) {
		tituloPelicula = laPelicula;
		codigo = elCodigo;
	}
	
	/**
	 * Da el código de la copia.
	 * @return Código de la copia
	 */
	public int darCodigo() {
		return codigo;
	}
	
	/**
	 * Da el título de la película.
	 * @return Título de la película.
	 */
	public String darTituloPelicula() {
		
		return tituloPelicula;
	}

    /**
     * Compara esta copia con otra para saber si tiene el mismo código y la misma pelicula.
     * @param otra La otra copia que se va a comparar. otra != null.
     * @return true si ambas copias son iguales, false en caso contrario.
     */
	public boolean esIgualA(Copia otra) {
		return otra != null && codigo == otra.darCodigo() &&
				tituloPelicula.equals(otra.darTituloPelicula());
	}
	
}