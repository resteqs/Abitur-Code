public class Knoten extends ListenElement{
    private ListenElement nachfolger;
    private Datenelement delement;
    public Knoten(ListenElement nachf){
        nachfolger = nachf;
    }
    public Knoten(ListenElement nachf, Datenelement dele){
          nachfolger = nachf;
          delement = dele;
    }
    public ListenElement hintenEinfuegen(Datenelement dele){
        return nachfolger.hintenEinfuegen(dele);
    }
    public ListenElement einfuegenVor(Datenelement dele, Datenelement vor){
        if(vor.istGleich(delement)){
            Knoten k = new Knoten(this, dele);
            return k;
        }else{
            nachfolger = nachfolger.einfuegenVor(dele, vor);
            return this;
        }
    }
    public ListenElement sortiertEinfuegen(Datenelement dele){
        if(dele.istKleiner(delement)){
             Knoten k = new Knoten(this, dele);
             return k ;
        }else{
            nachfolger = nachfolger.sortiertEinfuegen(dele);
            return this;
        }
    }
    public Datenelement deleGeben(){
        return delement;
    }
    public ListenElement nachfolgerGeben(){
        return nachfolger;
    }
    public Datenelement endeGeben(Datenelement dele){
        return nachfolger.endeGeben(delement);
    }
    public ListenElement knotenEntfernen(Datenelement data){
        if(data.istGleich(delement)){
            return nachfolger;
        }
        else{
            nachfolger = nachfolger.knotenEntfernen(data);
            return this;
        }
    }
    public Datenelement suchen(String s){
        if(delement.schluesselGeben().equals(s)){
            return delement;
        }else{
            return nachfolger.suchen(s);
        }
    }
}