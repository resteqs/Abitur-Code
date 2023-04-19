public abstract class Baumelement{
    public abstract Datenelement suchen (String s);
    public abstract Baumelement einfuegen(Datenelement dele);
    public abstract void preOrder();
    public abstract void inOrder();
    public abstract void postOrder();
}