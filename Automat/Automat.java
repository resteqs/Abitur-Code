public class Automat{
    private int aktuellerZustand;
    public Automat(int z){
        aktuellerZustand = z;
    }
    public void zeichenEingabeWeiterleiten(char z){
        switch(aktuellerZustand){
            case 1: z1Bearbeiten(z);
            break;
            case 2: z2Bearbeiten(z);
            break;
            case 3: z3Bearbeiten(z);
            break;
            case 4: z4Bearbeiten(z);
            break;
            default: break;
        }
    }
    public void z1Bearbeiten(char z){
        if(z == 'a'){
            aktuellerZustand = 4;
        }else if(z == 'b'){
            aktuellerZustand = 2;
        }
    }
     public void z2Bearbeiten(char z){
        if(z == 'a'){
            aktuellerZustand = 1;
        }else if(z == 'b'){
            aktuellerZustand = 3;
        }
    } public void z3Bearbeiten(char z){
        if(z == 'a'){
            aktuellerZustand = 2;
        }else if(z == 'b'){
            aktuellerZustand = 4;
        }
    } public void z4Bearbeiten(char z){
        if(z == 'a'){
            aktuellerZustand = 3;
        }else if(z == 'b'){
            aktuellerZustand = 1;
        }
    }
    public boolean istEingabeAkzeptiert(String wort){
        for(int i =0; i<wort.length(); i++){
            zeichenEingabeWeiterleiten(wort.charAt(0));
            wort = wort.substring(1);
            System.out.print(wort + " " + aktuellerZustand);
        }
        if(aktuellerZustand == 1 && wort.length() == 0){
            return true;
        }else{
            return false;
        }
    }
}