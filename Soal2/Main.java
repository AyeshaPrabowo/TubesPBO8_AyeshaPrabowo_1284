package Soal2;

public class Main {
public static void main(String[] args) {
    Sepeda sepeda1 = new Sepeda("S001", "Gunung", 3, 55000);
    Sepeda sepeda2 = new Sepeda("S002", "Balap", 2, 101000);
    Sepeda sepeda3 = new Sepeda("S003", "Listrik", 5, 57000);

    sepeda1.tampilkanData();
    sepeda2.tampilkanData();
    sepeda3.tampilkanData();
}
}