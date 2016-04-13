package ifpb.ads.pp.jsf.aula;

import java.util.Arrays;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 06/04/2016, 10:15:56
 */
@FacesValidator("validador.CampoValidador")
public class CampoValidador implements Validator {

    @Override
    public void validate(FacesContext context, UIComponent component, 
            Object value) throws ValidatorException {


        
        
        if(value==null || value.toString().trim().equals("")){
            FacesMessage message = new FacesMessage("campo obrigaorio");
            
            throw  new ValidatorException(message);
        }
        
        


    }
//if (!validaCPF(String.valueOf(valorTela))) {
//            FacesMessage message = new FacesMessage();
//            message.setSeverity(FacesMessage.SEVERITY_ERROR);
//            message.setSummary("CPF Inválido");
//            
//            throw new ValidatorException(message);
//        }
}
