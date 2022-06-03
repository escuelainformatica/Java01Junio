package modelo;

public class Libro {

    private String titulo;
    private String autor;
    private int precio;
    private Categoria cat;


    public Libro(String titulo, String autor, int precio, Categoria cat) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.cat = cat;
    }

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public Libro(String titulo, String autor, int precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    public Libro() {
    }

    public String getTitulo() {
        return titulo;
    }

    public Categoria getCat() {
        return cat;
    }

    public void setCat(Categoria cat) {
        this.cat = cat;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
