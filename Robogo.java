package hazi0225;

public class Robogo extends Jarmu implements KisGepjarmu{
    //maxSebesseg adattag létrehozása
    private int maxSebesseg;

    /*
    A robogó konstruktora a rendszámot, az aktuális sebességet és a maximális 
    sebességet kérje el paraméterül, és ez alapján hozza létre az objektumot. 
    */
    public Robogo(String rendszam, int aktualisSebesseg, int maxSebesseg) {
        super(aktualisSebesseg, rendszam); //super - az ősosztály konstruktorát hívja meg és átadja neki a rendszam és aktualisSebesseg 
        //paramétereket. Az ősosztály konstruktora meghívásával létrehozódik az Jarmu objektum és beállítódnak a megfelelő adattagok.
        this.maxSebesseg = maxSebesseg; //a Robogo osztály saját adattagja, a maxSebesseg értéke lesz beállítva a kapott maxSebesseg paraméterrel
    } 
    
    /*
    A gyorshajtottE metódus nézze meg, hogy a jármű aktuális sebessége fölötte van-e a paraméterként kapott
    korlátnak, és ennek megfelelően térjen vissza logikai értékkel.
    */
    
    public boolean gyorshajtottE(int sebesseg) {
        return this.sebesseg > sebesseg ? true : false; 
    }

    
    public boolean haladhatItt(int sebesseg) {
        return this.maxSebesseg > sebesseg ? false : true;
    }

    public int getMaxSebesseg() {
        return maxSebesseg;
    }

    public void setMaxSebesseg(int maxSebesseg) {
        this.maxSebesseg = maxSebesseg;
    } 
         
    @Override
    public String toString() {
        return "Robogo: " + super.toString();
}
/*
    @Override
    public String toString() {
        return "Robogo: " + super.toString() + " - " + this.getAktualisSebesseg() + " km/h";
}
    */
    
}
