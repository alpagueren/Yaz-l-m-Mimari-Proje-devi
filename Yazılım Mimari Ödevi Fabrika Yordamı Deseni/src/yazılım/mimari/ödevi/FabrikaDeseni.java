package yazılım.mimari.ödevi;


public class FabrikaDeseni {
    public static void main(String[] args){
        SekilFaktoru sekilFaktoru = new SekilFaktoru();
        
        Sekil sekil1 = sekilFaktoru.getSekil("DIKTORTGEN");
        sekil1.çiz();
        
        Sekil sekil2 = sekilFaktoru.getSekil("CEMBER");
        sekil2.çiz();
        
        Sekil sekil3 = sekilFaktoru.getSekil("KARE");
        sekil3.çiz();
    }
}
