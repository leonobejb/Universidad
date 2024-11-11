import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {

    private ArrayList<Libro> libros = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    // Método para registrar un nuevo libro
    public void registrarLibro() {
        System.out.println("Ingrese el código del libro:");
        String codigo = scanner.nextLine();
        System.out.println("Ingrese el nombre del libro:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el autor del libro:");
        String autor = scanner.nextLine();
        System.out.println("Ingrese la materia del libro:");
        String materia = scanner.nextLine();
        System.out.println("Ingrese el número de páginas del libro:");
        int numeroPaginas = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        Libro libro = new Libro(codigo, nombre, autor, materia, numeroPaginas);
        libros.add(libro);
        System.out.println("Libro registrado exitosamente.");
    }

    // Método para actualizar un libro
    public void actualizarLibro() {
        System.out.println("Ingrese el código del libro a actualizar:");
        String codigo = scanner.nextLine();
        Libro libro = buscarLibroPorCodigo(codigo);
        if (libro != null) {
            System.out.println("Ingrese el nuevo nombre del libro:");
            libro.setNombre(scanner.nextLine());
            System.out.println("Ingrese el nuevo autor del libro:");
            libro.setAutor(scanner.nextLine());
            System.out.println("Ingrese la nueva materia del libro:");
            libro.setMateria(scanner.nextLine());
            System.out.println("Ingrese el nuevo número de páginas del libro:");
            libro.setNumeroPaginas(scanner.nextInt());
            scanner.nextLine(); // Limpiar el buffer
            System.out.println("Libro actualizado exitosamente.");
        } else {
            System.out.println("No se encontró el libro con el código proporcionado.");
        }
    }

    // Método para eliminar un libro
    public void eliminarLibro() {
        System.out.println("Ingrese el código del libro a eliminar:");
        String codigo = scanner.nextLine();
        Libro libro = buscarLibroPorCodigo(codigo);
        if (libro != null) {
            libros.remove(libro);
            System.out.println("Libro eliminado exitosamente.");
        } else {
            System.out.println("No se encontró el libro con el código proporcionado.");
        }
    }

    // Método para buscar un libro por código
    public Libro buscarLibroPorCodigo(String codigo) {
        for (Libro libro : libros) {
            if (libro.getCodigo().equals(codigo)) {
                return libro;
            }
        }
        return null;
    }

    // Método para mostrar todos los libros
    public void mostrarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros registrados.");
        } else {
            for (Libro libro : libros) {
                System.out.println(libro);
            }
        }
    }
}
