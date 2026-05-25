class Mario {
    // Keadaan Mario:
    // 0 = Normal
    // 1 = Besar (setelah makan Jamur)
    // 2 = Api (setelah makan BungaApi)
    private int keadaan = 0;

    public Mario() {
        System.out.println("Hai saya Mario");
    }

    // Method Overloading untuk makan Jamur
    public void makan(Jamur jamur) {
        System.out.println("Mario makan " + jamur);
        this.keadaan = 1; // Menjadi besar
    }

    // Method Overloading untuk makan BungaApi
    public void makan(BungaApi api) {
        System.out.println("Mario makan " + api);
        this.keadaan = 2; // Menjadi api
    }

    public void lompat() {
        if (this.keadaan == 1) {
            System.out.println("Mario lompat dgn tubuh besar");
        } else if (this.keadaan == 2) {
            System.out.println("Mario lompat sambil menyembur api");
        } else {
            System.out.println("Mario lompat");
        }
    }
}
