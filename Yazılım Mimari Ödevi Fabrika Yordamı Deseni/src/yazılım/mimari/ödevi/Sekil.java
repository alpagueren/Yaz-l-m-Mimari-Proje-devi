
package yazılım.mimari.ödevi;


public class Sekil {

    void çiz() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public class Diktorgen implements Sekilİnterface{
        @Override
        public void çiz() {
            System.out.println("Diktörtgen çizimi :: çiz() yöntemiyle.");
            throw new UnsupportedOperationException("Not supported yet."); 
        }
    }
    public class Cember implements Sekilİnterface{
        @Override
        public void çiz() {
            System.out.println("Cember çizimi :: çiz() yöntemiyle.");
            throw new UnsupportedOperationException("Not supported yet."); 
        }
    }
    public class Kare implements Sekilİnterface{
        @Override
        public void çiz() {
            System.out.println("Kare çizimi :: çiz() yöntemiyle.");
            throw new UnsupportedOperationException("Not supported yet."); 
        }
    }
}
