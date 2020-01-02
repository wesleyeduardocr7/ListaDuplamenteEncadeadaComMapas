
package tadmapa;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Wesley Eduardo
 */

public class TadMapa {

    public static void main(String[] args) {
        
       Controle controle = new Controle();
       Map<Integer,String> mapaPessoas = new HashMap<>();
        
        mapaPessoas.put(1, "João Delfino");
        mapaPessoas.put(2, "Maria do Carmo");
        mapaPessoas.put(3, "Claudinei Silva");        
        mapaPessoas.put(4, "Wesley Eduardo");
        mapaPessoas.put(5, "Luis Carlos");
        mapaPessoas.put(6, "Paulo Andre");        
        mapaPessoas.put(7, "Antonio Pedro");
        mapaPessoas.put(8, "Thiago Sousa");
        mapaPessoas.put(9, "Gabriel Silva");
       
        mapaPessoas.entrySet().forEach((entry) -> {
            
            Integer key = entry.getKey();
            String value = entry.getValue();
                        
            Pessoa pessoa = new Pessoa();
            pessoa.setId(key);
            pessoa.setNome(value);   
            
            System.out.println(key);
            
            if(key%2 == 0){                
                controle.addInicio(pessoa);   
            }else{             
                controle.addFim(pessoa);  
            }            
            
        }); 
           
        System.out.println("\nIMPRIMINDO LISTA");
        System.out.println(controle.percorre());       
        
        System.out.println("");
        
        controle.removeFim();
        controle.removeInicio();       
        
        System.out.println("\nIMPRIMINDO LISTA APÓS REMOÇÕES");
        System.out.println(controle.percorre());        
      
    }
    
}
