package fontes;

public class Controle {

    public No inicio, fim;

    public Controle() {
        inicio = null;
        fim = null;
    }

    public boolean vazia() {
        return inicio == null && fim == null;
    }

    public void addInicio(Pessoa pessoa) {
        
        No novo = new No(pessoa);
        
        if (vazia()) {
            inicio = novo;
            fim = novo;
             System.out.println("\nAdd Inicio " + inicio.pessoa);
             
        } else {

            novo.prox = inicio;
            inicio.ant = novo;
            inicio = novo;
            System.out.println("Add Inicio " + inicio.pessoa);
        }
    }

    public void addFim(Pessoa pessoa) {
        
        No novo = new No(pessoa);

        if (vazia()) {
            inicio = novo;
            fim = novo;
            System.out.println("Add Inicio " + inicio.pessoa);
            
        } else {
            fim.prox = novo;
            novo.ant = fim;
            fim = novo;
            System.out.println("Add Fim " + fim.pessoa);
        }
    }

    public Pessoa removeInicio() {

        Pessoa pessoa = null;

        if (vazia()) {
            System.out.println("ERRO! Lista Vazia");
        } else {

            System.out.println("Dado a ser removido " + inicio.pessoa);
            pessoa = inicio.pessoa;
            inicio = inicio.prox;
            inicio.ant = null;
        }

        return pessoa;
    }

    public Pessoa removeFim() {

        Pessoa pessoa = null;

        if (vazia()) {
            System.out.println("ERRO! Lista Vazia");
        } else {
            System.out.println("Dado a ser removido " + fim.pessoa);

            pessoa = fim.pessoa;
            fim = fim.ant;
            fim.prox = null;
        }

        return pessoa;
    }
    
    public String percorre() {
        String r = "";

        if (vazia()) {
            System.out.println("Erro! Lista vazia");
        } else {

            No aux = inicio;

            while (aux != null) {
                r += " " + aux.pessoa.toString();
                aux = aux.prox;
            }
        }

        return r;
    }
}
