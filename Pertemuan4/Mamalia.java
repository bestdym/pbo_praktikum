package Pertemuan4;

// Kelas ini "nyata" (bukan abstrak), jadi dia wajib mengimplementasikan 
// metode-metode dari kakeknya (Hewan)
class Mamalia extends HewanBertulangBelakang {
    
    @Override
    void setSpesies(String sp) {
        this.spesies = sp;
    }

    @Override
    String getSpesies() {
        return this.spesies;
    }

    // Metode tambahan untuk mengambil data filum
    String getFilum() {
        return this.filum;
    }
}