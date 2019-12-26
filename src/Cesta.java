/**
 * @author Miguel García Insua
 *@version 26/12/2019/A
 */

import java.util.ArrayList;

/*
 * @param listaJuegos Es un array que contiene todos los juegos que tengamos en el cátalogo del programa
 */ 

public class Cesta {
    ArrayList<Videojuego> listaJuegos = new ArrayList<Videojuego>();
    public void agregarProducto(Videojuego v){
        listaJuegos.add(v);
    }
    public float calcularImporte(){
        float importe = 0;
        for (int i = 0; i <listaJuegos.size(); i++) {
        importe = importe + listaJuegos.get(i).getPrecio();
        }
        return importe;
}
}

/*
 * @return El importe resultante de la suma de todos los juegos añadidos a la cesta
 */
