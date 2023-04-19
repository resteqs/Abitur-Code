public class Liste{
    private ListenElement anfang;
    public Liste(){
        anfang = new Abschluss();
    }
    public void hintenEinfuegen(Datenelement data){
        anfang = anfang.hintenEinfuegen(data);
    }
    public void vorneEinfuegen(Datenelement data){
        ListenElement temp;
        temp = anfang;
        anfang = new Knoten(temp, data);
    }
    public void einfuegenVor(Datenelement data, Datenelement vor){
        anfang = anfang.einfuegenVor(data, vor);
    }
    public void sortiertEinfuegen(Datenelement data){
        anfang = anfang.sortiertEinfuegen(data);
    }
    public Datenelement anfangEntfernen(){
        Datenelement dele = anfang.deleGeben();
        anfang = anfang.nachfolgerGeben();
        return dele;
    }
    public Datenelement endeEntfernen(){
        Datenelement data = anfang.endeGeben(null);
        anfang = anfang.knotenEntfernen(data);
        return data;
    }
    public Datenelement knotenEntfernen(String s){
        Datenelement data = anfang.suchen(s);
        anfang = anfang.knotenEntfernen(data);
        return data;
    }
    public Datenelement suchen (String s){
        return anfang.suchen(s);
    }
    
}