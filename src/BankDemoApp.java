public class BankDemoApp {
    public static void main(String[] args) {
        int counter = 1;
        Konto max = new Konto("Max Muster");
        max.setInhaber("Max Mustermann");
        max.print();

        max.aufbuchen(1000);
        max.print();

        max.abbuchen(800);
        max.print();

        max.abbuchen(300);

        Konto susi = new Konto("Susi Sorglos");
        susi.aufbuchen(100_000);
        susi.print();
        Konto john = new Konto("John Doe");
        john.print();

    }
}
