import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú Biblioteca ---");
            System.out.println("1. Registrar libro");
            System.out.println("2. Actualizar libro");
            System.out.println("3. Eliminar libro");
            System.out.println("4. Buscar libro");
            System.out.println("5. Mostrar todos los libros");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    biblioteca.registrarLibro();
                    break;
                case 2:
                    biblioteca.actualizarLibro();
                    break;
                case 3:
                    biblioteca.eliminarLibro();
                    break;
                case 4:
                    System.out.println("Ingrese el código del libro a buscar:");
                    String codigo = scanner.nextLine();
                    Libro libro = biblioteca.buscarLibroPorCodigo(codigo);
                    if (libro != null) {
                        System.out.println(libro);
                    } else {
                        System.out.println("No se encontró el libro.");
                    }
                    break;
                case 5:
                    biblioteca.mostrarLibros();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 0);

        scanner.close();
    }
}
