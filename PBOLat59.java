/**
 *
 * @author 
 * Nama     : Dwi Ayu Lestari
 * Prodi    : Sistem Informasi - Reg. Pagi
 * NIM      : 22166030
 */
class Character {
    void info() {
        System.out.println("Ini adalah karakter dalam Akatsuki.");
    }
}

// Subclass Ninja
class Ninja extends Character {
    void info() {
        System.out.println("Ini adalah seorang ninja dalam Akatsuki.");
    }
}

// Subclass NonNinja
class NonNinja extends Character {
    void info() {
        System.out.println("Ini adalah anggota non-ninja dalam Akatsuki.");
    }
}

// Karakter spesifik dari Akatsuki
class Itachi extends Ninja {
    void info() {
        System.out.println("Itachi adalah seorang ninja legendaris dalam Akatsuki.");
    }
}

class Kisame extends Ninja {
    void info() {
        System.out.println("Kisame adalah seorang ninja dengan kekuatan air.");
    }
}

class Konan extends NonNinja {
    void info() {
        System.out.println("Konan adalah salah satu anggota wanita dari Akatsuki.");
    }
}

class Pain extends NonNinja {
    void info() {
        System.out.println("Pain adalah pemimpin Akatsuki.");
    }
}

// Main class untuk menjalankan program
public class PBOLat59 {
    public static void main(String[] args) {
        Character itachi = new Itachi();
        Character kisame = new Kisame();
        Character konan = new Konan();
        Character pain = new Pain();

        itachi.info();
        kisame.info();
        konan.info();
        pain.info();
    }
}
