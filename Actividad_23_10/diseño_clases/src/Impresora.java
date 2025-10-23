public class Impresora {
    private boolean tieneTinta;
    private boolean tieneBilletes;
 

    public Impresora(boolean tieneTinta,boolean tieneBilletes){
        this.tieneTinta = tieneTinta;
        this.tieneBilletes = tieneBilletes;
     
    }

    pubic boolean tieneTinta(){
        return tieneTinta;
    }

 pubic boolean tieneBilletes(){
        return tieneBilletes;
    }

    public void imprimirYExpulsarBillete(int tipo){
        if (tieneTinta && tieneBilletes){
            System.out.println("se esta imprimiendo y expulsando los billetes");
        }
    }




}
