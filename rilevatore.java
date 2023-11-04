import java.io.*;
import java.io.Serializable;
public class rilevatore implements Serializable{
    protected String tipo;
    protected comune comm;
    protected String prov;
    protected String reg;
    protected String nom;
    protected String ann;
    protected String date;
    protected String ident;
    protected String lon;
    protected String lat;

    //public static final long serialVersionUID = 42L;
    public rilevatore() {
        tipo="rilevatore";
        comm=new comune(1,"test");

    }
    public rilevatore(String t,comune m) {
        this.tipo=t;
        comm=m;
    }
    
    public void setcomune(comune m){
         comm=m;
    }
    public void setCod(String t){
            this.tipo=t;
    }
    public String getCod() {
        return tipo;
    }
    public comune getcomune() {
        return comm;
    }
    public String toString(){
            return tipo+" "+comm;
    }
}

