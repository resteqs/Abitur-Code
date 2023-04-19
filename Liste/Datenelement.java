public class Datenelement{
    private String schluessel;
    public Datenelement(String s){
        schluessel = s;
    }
    public boolean istGleich(Datenelement dele){
        if(dele.schluesselGeben().equals(schluessel)){
            return true;
        }else{
            return false;
        }
    }
    public boolean istKleiner(Datenelement dele){
        if(dele.schluesselGeben().compareTo(schluessel) < 0){
            return true;
        }else{
            return false;
        }
    }
    public String schluesselGeben(){
        return schluessel;
    }
    
}