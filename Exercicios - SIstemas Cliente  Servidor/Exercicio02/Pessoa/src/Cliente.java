public class Cliente extends Pessoa {
    
    private float valorDivida;

    public Cliente() {
    }

    public Cliente(String nome, String fone, float valorDivida) {
        super(nome, fone);
        this.valorDivida = valorDivida;
    }

    public float getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(float valorDivida) {
        this.valorDivida = valorDivida;
    }

    public float calculaJuros(float taxa) {
        return getValorDivida() + (getValorDivida() * taxa / 100);
    }

    @Override
    public void print() {
        System.out.println("*********** CLIENTE ***********\n" + 
                           "\nNome do Cliente: " + getNome() +
                           "\nTelefone do Cliente: " + getFone() +
                           "\nValor da Dívida do Cliente: R$" + getValorDivida() +
                           "\nDivida com Juros: R$" + calculaJuros(20));
    }
}
