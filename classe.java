
import java.io.Serializable;
public class classe implements Serializable{
    protected String nome;
    //public static final long serialVersionUID = 42L;
    public classe() {
        this.nome="nome";
    }
    public classe(String n) {
       this.nome=n;
    }
    
    public void setNome(String n){
         nome=n;
    }
    public String getNome() {
        return nome;
    }
    public String toString(){
            return "il nome è"+nome;
    }
}