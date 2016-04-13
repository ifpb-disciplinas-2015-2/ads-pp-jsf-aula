package ifpb.ads.pp.jsf.aula;

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
    
    
}
