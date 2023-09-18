public class App {
    public static void main(String[] args) throws Exception {
        
        // CLIENTE
        Cliente cliente = new Cliente("Lucas", "985442354", 1259.95f);
        cliente.print();

        // FORNECEDOR
        Fornecedor fornecedor = new Fornecedor("Pedrão", "97653482", 13429.99f);
        fornecedor.print();
    }
}
