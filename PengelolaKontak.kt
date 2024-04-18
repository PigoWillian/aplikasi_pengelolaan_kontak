class PengelolaKontak {
    private val daftarKontak = mutableListOf<Kontak>()

    fun tambahKontak(kontak: Kontak) {
        daftarKontak.add(kontak)
    }

    fun tampilkanKontak() {
        if (daftarKontak.isNotEmpty()) {
            println("Daftar Kontak:")
            daftarKontak.forEach {
                println("Nama: ${it.nama}, Nomor Telepon: ${it.nomorTelepon}, Email: ${it.email}")
            }
        } else {
            println("Daftar kontak kosong.")
        }
    }
}

fun main() {
    val pengelola = PengelolaKontak()

    println("Masukkan informasi kontak:")
    print("Nama: ")
    val nama = readLine() ?: ""
    print("Nomor Telepon: ")
    val nomorTelepon = readLine() ?: ""
    print("Email: ")
    val email = readLine() ?: ""

    val kontakBaru = Kontak(nama, nomorTelepon, email)

    pengelola.tambahKontak(kontakBaru)

    pengelola.tampilkanKontak()
}
