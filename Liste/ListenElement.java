public abstract class ListenElement{
    public abstract ListenElement hintenEinfuegen(Datenelement data);
    public abstract ListenElement einfuegenVor(Datenelement data, Datenelement vor);
    public abstract ListenElement sortiertEinfuegen(Datenelement data);
    public abstract Datenelement deleGeben();
    public abstract ListenElement nachfolgerGeben();
    public abstract Datenelement endeGeben(Datenelement dele);
    public abstract ListenElement knotenEntfernen(Datenelement dele);
    public abstract Datenelement suchen(String s);
}