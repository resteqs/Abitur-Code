public class Matrix{
    private Knoten[] knoten;
    private int[][] matrix;
    private boolean[] besucht;
    private int anzahlKnoten;
    
    public Matrix(int anzahl){
        anzahlKnoten = anzahl;
        besucht = new boolean[anzahl];
        matrix = new int[anzahl][anzahl];
        knoten = new Knoten[anzahl];
        for(int i = 0; i < anzahl; i++){
            for(int j = 0; j < anzahl; j++){
                matrix[i][j] = Integer.MIN_VALUE;
            }
        }
    }
    public void knotenEinfuegen(String s){
        if(knoten.length < anzahlKnoten && knotenNummer(s) == -1){
            knoten[anzahlKnoten] = new Knoten(s);
        }
    }
    public int knotenNummer(String s){
        for(int i = 0; i < anzahlKnoten; i++){
            if(knoten[i].nameGeben().equals(s)){
                return i;
            }
        }
        return -1;
    }
    public void kanteEinfuegen(String von, String nach, int gewicht){
        int v = knotenNummer(von);
        int n = knotenNummer(nach);
        if(v != -1 && n != -1){
            matrix[v][n] = gewicht;
        }
    }
    public int knotenAnzahlGeben(){
        return anzahlKnoten;
    }
    public int kantenGewichtGeben(String von, String nach){
        int v = knotenNummer(von);
        int n = knotenNummer(nach);
        if(v != -1 && n != -1){
            return matrix[v][n];
        }
        return Integer.MIN_VALUE;
    }
    public void tiefensuche(String startknoten){
        int s = knotenNummer(startknoten);
        if(s > -1){
            for(int i= 0; i< besucht.length; i++){
                besucht[i] = false;
            }
            besuchen(s);
        }
    }
    public void besuchen(int start){
        besucht[start] = true;
        System.out.println(knoten[start].nameGeben());
        for(int i =0; i < anzahlKnoten; i++){
            if(matrix[start][i] > -1 && besucht[i] == false){
                besuchen(i);
            }
        }
    }
}