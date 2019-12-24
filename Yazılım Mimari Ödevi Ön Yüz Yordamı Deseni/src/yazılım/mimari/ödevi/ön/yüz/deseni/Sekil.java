package yazılım.mimari.ödevi.ön.yüz.deseni;


public class Sekil {
    
    void ciz() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    public class Diktorgen implements Sekilİnterface{
        @Override
        public void ciz() {
            System.out.println("Diktörtgen çizimi :: çiz() yöntemiyle.");
            throw new UnsupportedOperationException("Not supported yet."); 
        }
    }
    public class Cember implements Sekilİnterface{
        @Override
        public void ciz() {
            System.out.println("Cember çizimi :: çiz() yöntemiyle.");
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }
    public class Kare implements Sekilİnterface{
        @Override
        public void ciz() {
            System.out.println("Kare çizimi :: çiz() yöntemiyle.");
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }
}
