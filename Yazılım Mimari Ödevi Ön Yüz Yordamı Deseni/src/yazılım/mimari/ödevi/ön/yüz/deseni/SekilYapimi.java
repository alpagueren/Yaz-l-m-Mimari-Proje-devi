package yazılım.mimari.ödevi.ön.yüz.deseni;


public class SekilYapimi {
    private final Sekil Dikdortgen;
    private final Sekil Cember;
    private final Sekil Kare;
    
    public SekilYapimi(){
        Dikdortgen = new dikdortgen();
        Cember = new cember();
        Kare = new kare();
        
    }
    public void cizdikdortgen(){
        Dikdortgen.ciz();
    }
    public void cizcember(){
        Cember.ciz();
    }
    public void cizkare(){
        Kare.ciz();
    }

    private static class dikdortgen extends Sekil {

        public dikdortgen() {
        }
    }

    private static class cember extends Sekil {

        public cember() {
        }
    }

    private static class kare extends Sekil {

        public kare() {
        }
    }
}
