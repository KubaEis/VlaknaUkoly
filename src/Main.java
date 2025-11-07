public class Main {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;       // 0 a 1 nejsou prvočísla
        if (n == 2) return true;        // 2 je prvočíslo
        if (n % 2 == 0) return false;   // sudá čísla > 2 nejsou prvočísla

        // kontrola dělení jen do odmocniny z n
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws InterruptedException {
        //UKOL1
        /*Thread cisla = new Thread(()->{
            for (int i=0; i<=1000; i++) {
                System.out.println(i);
            }
        });
        Thread abeceda = new Thread(()->{
            for (int i=97; i<=122; i++) {
                System.out.println((char)i);
            }
        });
        cisla.start();
        abeceda.start();*/

        //UKOL2
        /*Thread spiciVlakno = new Thread(()->{
            while(!Thread.currentThread().isInterrupted()){
                try {
                    System.out.println(Thread.currentThread().getName());
                    Thread.sleep(5000);
                    System.out.println("Vlakno dobehlo");
                } catch (InterruptedException e) {
                    System.out.println(Thread.currentThread().getName() +" BYLO PRERUSENO");
                    Thread.currentThread().interrupt();
                }
            }
        });
        spiciVlakno.start();
        Thread.sleep(1000);
        spiciVlakno.interrupt();*/

        //UKOL3
        /*Thread deleniNulou = new Thread(()->{
            try {
                int deleni = 10/0;
            } catch (Exception e) {
                System.out.println("nemuzes delit nulou");
            }
        });
        deleniNulou.start();*/

        //UKOL4
        /*Thread zdravicko = new Thread(()->{
            while(!Thread.currentThread().isInterrupted()) {
                System.out.println("Zdravicko");
            }
        });
        zdravicko.setName("Zdravicko");
        Thread stopka = new Thread(()->{
            System.out.println("STACILO!!!!!!");
            zdravicko.interrupt();
        });
        zdravicko.setName("Stopka");
        zdravicko.start();
        stopka.start();*/

        //UKOL 5
        /*Thread trojcifernaDelitelnaCtyrma = new Thread(()->{
            int soucet = 0;
            System.out.println("Vsechna trojciferna cisla delitelna ctyrma:");
            for(int i=100; i<1000; i++){
                if (i % 4 == 0){
                    System.out.println(i);
                    soucet += i;
                }
            }
            System.out.println("Soucet vsech trojcifernych cisel delitelnych ctyrma je: "+soucet);
        });
        Thread ctyrcifernaDelitelnaStem = new Thread(()->{
            int soucet = 0;
            System.out.println("Vsechna ctyrciferna cisla delitelna stem:");
            for(int i=1000; i<10000; i++){
                if (i % 100 == 0){
                    System.out.println(i);
                    soucet += i;
                }
            }
            System.out.println("Soucet vsech ctyrcifernych cisel delitelnych stem je: "+soucet);
        });
        Thread prvocislaMensiNezTisic = new Thread(()->{
            int soucet = 0;
            System.out.println("Vsechna prvocisla do 1000:");
            for(int i=0; i<1000; i++){
                if (isPrime(i)){
                    System.out.println(i);
                    soucet += i;
                }
            }
            System.out.println("Soucet vsech prvocisel do 1000: "+soucet);
        });
        trojcifernaDelitelnaCtyrma.start();
        ctyrcifernaDelitelnaStem.start();
        prvocislaMensiNezTisic.start();*/
        Faktorial fk = new Faktorial();
        System.out.println(fk.faktorialLong(10L));
        System.out.println(fk.faktorialBigInteger(100));
        System.out.println(fk.faktorialBigInteger(1000));


    }
}