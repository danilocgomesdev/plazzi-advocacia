package plazzi.core.exceptions;

public class EntidadeNotFoundException extends RuntimeException{
    private static final long serialVersionUID = 1L;
    
    public EntidadeNotFoundException(String msg){
        super(msg);
    }
}
