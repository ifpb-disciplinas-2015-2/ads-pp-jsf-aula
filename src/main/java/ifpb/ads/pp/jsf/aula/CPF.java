package ifpb.ads.pp.jsf.aula;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 06/04/2016, 09:30:19
 */
public class CPF {

    private String valor;

    public CPF(String valor) {
        this.valor = valor;
    }

    public CPF() {
    }

    public String getValor() {
        return valor;
    }
    public String formatado() {
        String cpf = valor;

        if (cpf != null && cpf.length() == 11) {
            cpf = cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." + cpf.substring(6, 9) + "-" + cpf.substring(9, 11);
        }
        return cpf;
    }
    
    public boolean isValid(){
        return this.valor.length()==11;
    }

}
