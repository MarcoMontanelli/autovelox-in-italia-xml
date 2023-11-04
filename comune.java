
import java.io.Serializable;
public class comune implements Serializable{
    protected classe classe;
    //public static final long serialVersionUID = 42L;
    public comune() {
        classe=new classe("nome");
    }
    public comune(classe m) {
        classe=m;
    }
    
    public void setclasse(classe m){
         classe=m;
    }
    public classe getclasse() {
        return classe;
    }
    public String toString(){
            return "la classe è"+classe;
    }
}
