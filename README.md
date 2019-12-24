# Yazılım Mimarisi ve Tasarımmı Proje Ödevi
# Konu : Fabrika Yordami Tasarim Deseni ve Ön Yüz Tasarim Deseni Örneği

#Fabrika Yordamı (YARATIMSAL) Tasarım Deseni:
Fabrika yordam tasarım deseni, nesne yaratma sorumluluğunun bir yordama verilmesidir. Yaratılan nesne, bir sınıf hiyerarşisindeki alt sınıflardan biridir. Hangi alt sınıfın yaratılacağı kararı fabrika yordam içinde verilir. Bu yordam ile belirli bir sınıf hiyerarşisindeki alt nesnelerden birinin yaratma sorumluluğu belirli bir arayüze verilerek sistemden soyutlanmış olur. Böylece nesneleri yaratma kodlarında, kod tekrarları önlenmiş olur. Sistem içinde sınıfların yaratılacağı yer tek olduğu için, ilgili mantıklar tek bir yerde toplanabilir.
![Image of Class](https://github.com/alpagueren/Yaz-l-m-Mimari-Proje-devi/blob/master/Fabrika%20desen.png)

interface
```java
public interface Sekilİnterface {
    void çiz(); 
}
```
Şekilleri tanımladığım sınıf
```java
public class Sekil {
    public class Diktorgen implements Sekilİnterface{
        @Override
        public void çiz() {
            System.out.println("Diktörtgen çizimi :: çiz() yöntemiyle.");
        }
    }
    public class Cember implements Sekilİnterface{
        @Override
        public void çiz() {
            System.out.println("Cember çizimi :: çiz() yöntemiyle.");
        }
    }
    public class Kare implements Sekilİnterface{
        @Override
        public void çiz() {
            System.out.println("Kare çizimi :: çiz() yöntemiyle.");
        }
    }
}
```
Girilen değere göre hangi sınıfın çalışacağına karar verir.
```java
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
    ```
    Main Kısmı :
    Yapılan seçime göre çizilmesi gereken şeklin emrini veriyor. 
    ```java
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
```
# Ön Yüz (YAPISAL) Tasarım Deseni
Bu tasarım deseni, sistemin detaylarını saklayarak, istemcinin dışarıdan sisteme ulaşabilmesi için tek bir ön yüz sunar. Sistemdeki alt sınıflara, bu ön yüz sınıfı ile ulaşılır.  İstemci yalnızca sistemdeki bu ön yüz sınıfını bilir. Yani kısaca ön yüz sınıfı, sistemin dışarıya açılmış bir kapısı gibidir. 
![Image of Class](https://github.com/alpagueren/Yaz-l-m-Mimari-Proje-devi/blob/master/%C3%96n%20Y%C3%BCz%20DESEN.png)
Interface
```java
public interface Sekilİnterface {
    void ciz();   
}
```
Şekilleri tanımladığım yer
```java
public class Sekil {  
    public class Diktorgen implements Sekilİnterface{
        @Override
        public void ciz() {
            System.out.println("Diktörtgen çizimi :: çiz() yöntemiyle.");           
        }
    }
    public class Cember implements Sekilİnterface{
        @Override
        public void ciz() {
            System.out.println("Cember çizimi :: çiz() yöntemiyle.");            
        }
    }
    public class Kare implements Sekilİnterface{
        @Override
        public void ciz() {
            System.out.println("Kare çizimi :: çiz() yöntemiyle.");
        }
    }
}
```
Şekillerin çizime hazır ve nesne olarak tanımlandığı yer 
```java
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
   ```
   Main Kısmı :
   Şekil yap adlı bir nesne tanımlandı ve şekiller çizildi.
   ```java
   public class OnYuzDeseniDemo {

   
    public static void main(String[] args) {
        SekilYapimi sekilYapimi = new SekilYapimi();
        
        sekilYapimi.cizdikdortgen();
        sekilYapimi.cizcember();
        sekilYapimi.cizkare();
    }
    
}
   ```
