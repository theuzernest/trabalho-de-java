package modelo;

public class Teste {
    
    public static void main(String[] args) {
        Banco b = new Banco();
        Cliente c = b.createClienteFisico();
        c.depositar(0);
        System.out.println(c);
        
        Cliente cj = b.createClienteJuridico();
        System.out.println(cj);
    }
    
}
public class