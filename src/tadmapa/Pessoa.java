
package tadmapa;


public class Pessoa {
    
    private int id;
    private String nome;
    
    public Pessoa() {}

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "\n{ Id = " + this.id + " ->  Nome = " + this.nome + " }";
    }
    
}
