public class Abschluss extends ListenElement {
    public Abschluss(){
        
    }
    public ListenElement hintenEinfuegen(Datenelement dele){
        return new Knoten(this, dele);
    }
    public ListenElement einfuegenVor(Datenelement dele, Datenelement vor){
        return new Knoten(this, dele);
    }
    public ListenElement sortiertEinfuegen(Datenelement dele){
        return new Knoten (this, dele);
    }
    public Datenelement deleGeben(){
        return null;
    }
    public ListenElement nachfolgerGeben(){
        return this;
    }
    public Datenelement endeGeben(Datenelement dele){
        return dele;
    }
    public ListenElement knotenEntfernen(Datenelement dele){
        System.out.println("Nicht gefunden");
        return this;
    }
    public Datenelement suchen(String s){
        return null;
    }
}