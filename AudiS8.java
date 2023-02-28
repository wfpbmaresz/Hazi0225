package hazi0225;

public class AudiS8 extends Jarmu {
    private boolean lezerblokkolo;

    public AudiS8(String rendszam, int sebesseg, boolean lezerblokkolo) {
        super(sebesseg,rendszam);
        this.lezerblokkolo = lezerblokkolo;
    }

    
    public boolean gyorshajtottE(int sebessegKorlat) {
        return (lezerblokkolo) ? false : (this.sebesseg > sebessegKorlat);
        }
    
   public boolean isLezerblokkolo() {
       return lezerblokkolo;
   }
   public void setLezerblokkolo(boolean lezerblokkolo){
       this.lezerblokkolo = lezerblokkolo;
   }
   
   @Override
    public String toString() {
        return "Audi: " + super.toString();
    }
}
