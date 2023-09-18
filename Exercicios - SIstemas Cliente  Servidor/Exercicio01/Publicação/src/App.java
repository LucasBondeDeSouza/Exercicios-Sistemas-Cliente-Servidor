public class App {
    public static void main(String[] args) throws Exception {
        
        // LIVRO
        Livro livro = new Livro("A Cabana", "15/05/2007", "Editora Arqueiro");
        livro.imprimir();

        // REVISTA
        Revista revista = new Revista("DIÁRIO DA EXAUSTÂO", "11/05/20", "ÉPOCA", "Brasil");
        revista.imprimir();
    }
}
