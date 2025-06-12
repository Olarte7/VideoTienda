/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
 * $Id: VideoTienda.java,v 1.1 2005/12/16 15:13:33 k-marcos Exp $
 * Universidad de los Andes (Bogot� - Colombia)
 * Departamento de Ingenier�a de Sistemas y Computaci�n 
 * Licenciado bajo el esquema Academic Free License version 2.1 
 *
 * Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
 * Ejercicio: n4_videotienda
 * Autor: Katalina Marcos - Diciembre 2005
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
 */

package uniandes.cupi2.videotienda.mundo;

import java.util.ArrayList;

/**
 * clase representa un cliente de la videotienda.
 */
public class Cliente {

	//-----------------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------------

    /**
     * Cédula del cliente
     */
    private String cedula;

    /**
     * Nombre del cliente
     */
    private String nombre;

    /**
     * Dirección del cliente
     */
    private String direccion;

    /**
     * Saldo disponible del cliente
     */
    private int saldo;

    /**
     * Copias alquiladas por el cliente
     */
    private ArrayList<Copia> darAlquiladas;
    
  //-----------------------------------------------------------------
    // Constructor
    //-----------------------------------------------------------------

    /**
     * Crea un nuevo cliente.
     * @param cedula Cédula del cliente. cedula != null.
     * @param nombre Nombre del cliente. nombre != null.
     * @param direccion Dirección del cliente. direccion != null.
     */
    public Cliente(String cedula, String nombre, String direccion) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.saldo = 0;
        this.darAlquiladas = new ArrayList<Copia>();
    }
    
  //-----------------------------------------------------------------
    // Métodos
    //-----------------------------------------------------------------

    /**
     * Da la cédula del cliente.
     * @return cédula del cliente.
     */
    public String darCedula() {
        return cedula;
    }
    
    /**
     * Da el saldo disponible del cliente.
     * @return saldo del cliente.
     */
    public int darSaldo() {
    	return saldo;
    }

    /**
     * Da el nombre del cliente.
     * @return nombre del cliente.
     */
    public String darNombre() {
        return nombre;
    }

    /**
     * Da la dirección del cliente.
     * @return dirección del cliente.
     */
    public String darDireccion() {
        return direccion;
    }

    /**
     * Alquila una copia para el cliente.
     * @param copia Copia a alquilar. copia != null.
     */
    public void alquilarCopia(Copia copia) 
    {
    	darAlquiladas.add(copia);
    }
    
    /**
     * Recarga el saldo del cliente.
     * @param monto Monto que va a recargar. monto > 0.
     */
    public void cargarSaldo(int monto) 
    {
    	saldo = saldo + monto;
    }
    
    /**
     * Descuenta el saldo del cliente.
     * @param monto Monto que desconta. monto > 0.
     */
    public void descargarSaldo(int monto) 
    {
    	saldo = saldo - monto;
    }
    

    /**
     * Retorna las copias alquiladas.
     * @return las copias alquiladas.
     */
    public ArrayList<Copia> darAlquiladas() 
    {
        return darAlquiladas;
    }
    
    /**
     * Devuelve una copia alquilada por el cliente.
     * @param titulo Título de la película.
     * @param numeroCopia Número de copia.
     * @return devolver la copia.
     * @throws Exception si el cliente no tiene la copia alquilada.
     */
    public Copia buscarPeliculaAlquilada(String pelicula, int codigo) throws Exception {
        for (Copia c : darAlquiladas) {
            if (c.darCodigo() == codigo && c.darTituloPelicula().equals(pelicula)) {
                return c;
            }
        }
        throw new Exception("El cliente no tiene la copia alquilada"); // No se encontró la copia
    }
    
    /**
     * devolver la copia que el cliente alquiló
     * @param titulo Titulo de la pelicula
     * @param numeroCopia Número de copia
     * @return devolver la copia
     * @throws Exception si el cliente no ha alquilado la copia
     */
    public Copia devolverCopia(String titulo, int numeroCopia) throws Exception {
    	for (Copia c : darAlquiladas) {
            if (c.darCodigo() == numeroCopia && c.darTituloPelicula().equals(titulo)) {
                return c;
            }
        }
        throw new Exception("El cliente no tiene alquilada esa copia.");
    }
    
}