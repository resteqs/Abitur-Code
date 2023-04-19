public class binBaum{
    private Baumelement wurzel;
    public binBaum(){
        wurzel = new Abschluss();
    }
    public Datenelement suchen(String s){
        return wurzel.suchen(s);
    }
    public void einfuegen(Datenelement dele){
        wurzel.einfuegen(dele);
    }
    public void preOrder(){
        wurzel.preOrder();
    }
}