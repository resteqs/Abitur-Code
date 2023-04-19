public class Abschluss extends Baumelement{
    public Abschluss(){
        
    }

    
    
    
    
    
    
    
    
    
    
    

    
    
    
    
    public Datenelement suchen(String s){
        return null;
    }
    public Baumelement einfuegen(Datenelement dele){
        return new Knoten(this, new Abschluss(), dele);
    }
    public void preOrder(){}
    public void inOrder(){}
    public void postOrder(){}
}