public class Livro extends Publicacao {
    
    private String editora;

    public Livro(String titulo, String dataPublicacao, String editora) {
        super(titulo, dataPublicacao);
        this.editora = editora;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    @Override
    public void imprimir() {
        System.out.println("*********** LIVRO ***********\n" +
                           "\nTitulo: " +getTitulo()+
                           "\nData de Publicação: " +getDataPublicacao()+
                           "\nEditora: " +getEditora());
    }
}
