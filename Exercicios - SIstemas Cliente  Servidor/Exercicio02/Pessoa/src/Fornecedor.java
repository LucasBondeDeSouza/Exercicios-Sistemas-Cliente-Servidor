public class Fornecedor extends Pessoa implements Seguranca {
    
    private float valorCompra;

    public Fornecedor() {
    }

    public Fornecedor(String nome, String fone, float valorCompra) {
        super(nome, fone);
        this.valorCompra = valorCompra;
    }

    public float getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(float valorCompra) {
        this.valorCompra = valorCompra;
    }

    public void calculaImposto(float imposto) {
        System.out.println("Valor com Imposto: R$" + getValorCompra() / (1 - imposto / 100));
    }

    @Override
    public boolean validar() {
        if (getValorCompra() <= 0){
            System.out.println("Valor de Compra Inválido!");
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void print() {
        System.out.println("\n\n*********** FORNECEDOR ***********\n" + 
                           "\nNome do Fornecedor: " + getNome() +
                           "\nTelefone do Fornecedor: " + getFone() +
                           "\nValor da Compra do Fornecedor: R$" + getValorCompra());
        calculaImposto(20); 
        validar();              
    }
}