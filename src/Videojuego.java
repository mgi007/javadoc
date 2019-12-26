/**
 * @author <h2>Miguel García Insua</h2>
 *@version <h2>26/12/2019/A</h2>
 */
public class Videojuego {
    private String titulo;
    private String plataforma;
    private String desarrollador;
    private String edad;
    private float precio;

/*
 * @param El parámetro titulo Título del juego
 * El parámetro plataforma Plataforma en la que se ejecuta el juego
 * El parámetro desarrollador Nombre del desarrolador del juego
 * El parámetro edad Edad mínima para jugar al juego
 * El parámetro precio Precio del juego
 */
    public Videojuego(String titulo, String plataforma, String desarrollador, String edad, float precio) {
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.desarrollador = desarrollador;
        this.edad = edad;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }
/*
 * @return El título del videojuego
 */
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getDesarrollador() {
        return desarrollador;
    }

    public void setDesarrollador(String desarrollador) {
        this.desarrollador = desarrollador;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    
}
