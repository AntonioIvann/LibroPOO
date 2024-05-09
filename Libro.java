import java.util.Scanner;

public class Libro {
    private String ISBN;
    private String Tit;
    private String Aut;
    private int numPaginas;
    
    // Constructor con todos los atributos pasados por parámetro
    public Libro(String ISBN, String titulo, String autor, int numeroPaginas) {
        this.ISBN = ISBN;
        this.Tit = titulo;
        this.Aut = autor;
        this.numPaginas = numeroPaginas;
    }
    
    // Constructor vacío
    public Libro() {
        // No hace nada, deja los atributos en sus valores por defecto
    }
    
    
    // Método para cargar un libro pidiendo los datos al usuario
    public void cargarLibro() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el ISBN del libro:");
        ISBN = scanner.nextLine();
        System.out.println("Ingrese el título del libro:");
        Tit = scanner.nextLine();
        System.out.println("Ingrese el autor del libro:");
        Aut = scanner.nextLine();
        System.out.println("Ingrese el número de páginas del libro:");
        numPaginas = scanner.nextInt();
        
    }
    
    // Método para informar los detalles del libro
    public void informarDetalles() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Título: " + Tit);
        System.out.println("Autor: " + Aut);
        System.out.println("Número de páginas: " + numPaginas);
    }
    
}