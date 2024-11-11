public class Libro {
    private String codigo;
    private String nombre;
    private String autor;
    private String materia;
    private int numeroPaginas;

    public Libro(String codigo, String nombre, String autor, String materia, int numeroPaginas) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.autor = autor;
        this.materia = materia;
        this.numeroPaginas = numeroPaginas;
    }

    // Métodos getter y setter
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                ", materia='" + materia + '\'' +
                ", numeroPaginas=" + numeroPaginas +
                '}';
    }
}
