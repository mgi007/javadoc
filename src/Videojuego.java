
/**
 * @author Miguel García Insua
 *
 */
public class Videojuego {
    private String titulo;
    private String plataforma;
    private String desarrollador;
    private String edad;
    private float precio;

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
