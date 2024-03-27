package modelo;


public class Cliente {
    private int id;
    private String tipo;
    private String nome;
    private String documento;
    private double saldo;
    public static void main(String[] args) {
        
    }

    public Cliente(int id, String tipo, String nome, String documento) {
        this.id = id;
        this.tipo = tipo;
        this.nome = nome;
        this.documento = documento;
        this.saldo = 0.00;
    }

    public boolean sacar(double valor) {
        if (valor > 0 && this.saldo > valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }
    
    public boolean depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            return true;
        }
        return false;
    }
    public boolean transferir(Cliente clienteDestino, double valor) {
        if (valor > 0 && this.saldo > valor){
            this.saldo -= valor;
            clienteDestino.depositar(valor);
            System.out.println("Seu saldo atualizado é:" + saldo );
            return true;
            
        }
            return false;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nome=" + nome + ", saldo=" + saldo + '}';
    }
   
}
