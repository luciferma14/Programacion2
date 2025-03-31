public class Libro {
    
    String isbn;
    String titulo;
    String autor;
    int numPaginas;

    public Libro(String isbn, String autor){
        this.isbn = isbn;
        this.autor = autor;
    }

    public Libro(String isbn, String titulo, String autor, int numPaginas){
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }
}
