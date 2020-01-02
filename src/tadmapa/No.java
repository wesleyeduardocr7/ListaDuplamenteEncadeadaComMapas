
package tadmapa;

public class No {
    
    public Pessoa pessoa;
    public No prox;
    public No ant;

    public No(Pessoa pessoa) {
        this.pessoa = pessoa;
        prox = null;
        ant = null;
    }
}
