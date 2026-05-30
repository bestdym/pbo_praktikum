package Pertemuan6;

class GameMain {
    public static void main(String[] args) {
        MainCharacter demonKing = new MainCharacter("Dimas Baik");

        System.out.println();

        Serangan pedang = new SeranganFisik();
        Serangan magic = new SeranganSihir();

        System.out.println();

        demonKing.serang(pedang);
        demonKing.efek();
        demonKing.serang(magic);
        demonKing.efek();
    }
}
