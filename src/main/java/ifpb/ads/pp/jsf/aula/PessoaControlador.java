package ifpb.ads.pp.jsf.aula;

import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 01/04/2016, 10:28:23
 */
@Named
@RequestScoped
public class PessoaControlador {

    private Pessoa pessoa;

    public PessoaControlador() {
        pessoa = new Pessoa();
    }

    public Pessoa getPessoa() {
        return pessoa;
    }
    
    public String enviar(){

//        return "home.xhtml?faces-redirect=true";
        return "home.xhtml";
    }
    
    public List<Pessoa> getLista(){
        List<Pessoa> lista = new ArrayList<>();
        lista.add(new Pessoa("Kiko", "12345678890"));
        lista.add(new Pessoa("Chaves", "12345678890"));
        return lista;
    }
    
    public String test(Pessoa pessoa){
        this.pessoa = pessoa;
        return "home.xhtml";
    }
    
}
