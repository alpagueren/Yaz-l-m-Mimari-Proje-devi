
package yazılım.mimari.ödevi;


public class SekilFaktoru {
    
    public Sekil getSekil(String SekilTipi ){
        if(SekilTipi == null){
            return null;
        }
        if(SekilTipi.equalsIgnoreCase("DIKDORTGEN")){
            return new Dikdortgen();
        } else if(SekilTipi.equalsIgnoreCase("CEMBER")){
            return new Cember();
        } else if(SekilTipi.equalsIgnoreCase("KARE")){
            return new Kare();
        }
        return null;
    }

    private static class Dikdortgen extends Sekil {

        public Dikdortgen() {
        }
    }

    private static class Cember extends Sekil {

        public Cember() {
        }
    }

    private static class Kare extends Sekil {

        public Kare() {
        }
    }
}
