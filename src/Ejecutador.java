/*
 * @author Miguel García Insua
 *@version 26/12/2019/A
 *@see <a href = "https://github.com/mgi007/javadoc.git" /> Actividad Javadoc Miguel García DAM1 </a>
 */

public class Ejecutador {

    public static void main(String[] args) {
        Videojuego v1 = new Videojuego("Dark Souls", "Play Station 3", "From Software", "16", 25.40f);
        Videojuego v2 = new Videojuego("Fifa 19", "Play Station 4", "EA Sports", "12", 25.40f);
        Videojuego v3 = new Videojuego("Mortal Kombat XI", "XBOX-one", "NetherRealm Studios", "18", 56.95f);
        Videojuego v4 = new Videojuego("Fortnite", "Nintendo Swich", "Epic Games", "12", 36.95f);

/*
 * @return Cada objeto del tipo Videojuego que creamos será un videojuego más que tendremos en el católogo de nuestro programa
 */   
        
        Cesta c1 = new Cesta();
        c1.agregarProducto(v1);
        c1.agregarProducto(v2);
        c1.agregarProducto(v3);
        c1.agregarProducto(v4);
        float importeCesta = c1.calcularImporte();
        System.out.println("Importe de la compra :" + importeCesta);
    }
}

