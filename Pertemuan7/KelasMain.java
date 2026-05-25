class KelasMain {
    public static void main(String[] a) {
        Mario myMario = new Mario();
        myMario.lompat();

        Jamur jamur = new Jamur();
        BungaApi api = new BungaApi();

        myMario.makan(jamur);
        myMario.lompat();
        myMario.makan(api);
        myMario.lompat();
    }
}
