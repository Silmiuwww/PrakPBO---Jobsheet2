public class TelevisiDemo {
    public static void main(String[] args) {
        Televisi tv1 = new Televisi();
        tv1.merk = "Samsung";
        tv1.ukuranlayar = 50;
        tv1.volume = 30;
        tv1.channel = 7;

        tv1.displayInfo();
        tv1.pindahChannel(22); 
        tv1.pindahChannel(35); 
    }
}