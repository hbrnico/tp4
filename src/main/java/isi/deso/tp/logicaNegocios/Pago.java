package isi.deso.tp.logicaNegocios;

public class Pago {
    private MetodoPago metodo;
    //para MP
    private String alias;
    //para TF
    private String CVU;
    private String CUIT;

    public Pago() {

    }
    public Pago(String alias) {
        this.alias = alias;
    }
    public Pago(String CVU, String CUIT) {
        this.CVU = CVU;
        this.CUIT = CUIT;
    }

    public String getMetodo(){
        return this.metodo.name();
    }

    public String getAlias(){
        return this.alias;
    }

    public String getCVU(){
        return this.CVU;
    }

    public String getCUIT(){
        return this.CUIT;
    }
}
