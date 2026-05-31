package Pertemuan6;

class GameMain {
    public static void main(String[] args) {
        MainCharacter demonKing = new MainCharacter("Dimas");

        System.out.println();

        Serangan pedang = new SeranganFisik();
        Serangan magic = new SeranganSihir();
        Serangan panah = new SenjataPanah();
        Serangan sihirEs = new SihirEs();

        System.out.println();

        demonKing.serang(pedang);
        demonKing.efek();
        demonKing.serang(magic);
        demonKing.efek();
        demonKing.serang(panah);
        demonKing.efek();
        demonKing.serang(sihirEs);
        demonKing.efek();
    }
}
