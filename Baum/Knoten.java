public class Knoten extends Baumelement{
    private Baumelement nachfolgerLinks;
    private Baumelement nachfolgerRechts;
    private Datenelement delement;
    public Knoten(Datenelement dele){
        delement = dele;
    }public Knoten (Baumelement links, Baumelement rechts, Datenelement dele){
        nachfolgerLinks = links;
        nachfolgerRechts = rechts;
        delement = dele;
    }
    public Datenelement suchen(String s){
        if(delement.schluesselGeben().equals(s)){
            return delement;
        }else if(delement.istKleiner(s)){
            return nachfolgerRechts.suchen(s);
        }else{
            return nachfolgerLinks.suchen(s);
        }
    }
    public Baumelement einfuegen(Datenelement dele){
         if(delement.istGleich(dele)){
            System.out.println("Fehler");
        }else if(delement.istKleiner(dele)){
            nachfolgerRechts = nachfolgerRechts.einfuegen(dele);
        }else{
           nachfolgerLinks = nachfolgerLinks.einfuegen(dele);
        }
        return this;
    }
    public void preOrder(){
        System.out.print(delement.schluesselGeben());
        nachfolgerLinks.preOrder();
        nachfolgerRechts.preOrder();
    }
     public void inOrder(){
        nachfolgerLinks.preOrder();
        System.out.print(delement.schluesselGeben());
        nachfolgerRechts.preOrder();
    }
     public void postOrder(){
        nachfolgerLinks.preOrder();
        nachfolgerRechts.preOrder();
        System.out.print(delement.schluesselGeben());
    }
    
}