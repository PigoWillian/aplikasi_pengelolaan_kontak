data class Kontak(internal val nama: String, internal val nomorTelepon: String, internal val email: String)
class PengelolaKontak{
    private val daftarKontak = mutableListOf<Kontak>()

    fun tambahKontak(kontak: Kontak) {
        daftarKontak.add(kontak)
    }

    fun hapusKontak(nama: String) {
        val kontak = daftarKontak.find { it.nama == nama }
        if (kontak != null) {
            daftarKontak.remove(kontak)
            println("$nama telah dihapus dari daftar kontak.")
        } else {
            println("$nama tidak ditemukan dalam daftar kontak.")
        }
    }
    
    fun tampilkanKontak() {
        if (daftarKontak.isNotEmpty()) {
            println("Daftar Kontak:")
            daftarKontak.forEach {
               it.cetakInformasi()
            }
        } else {
            println("Daftar kontak kosong.")
        }
    }
}

// Extension function untuk mencetak informasi kontak
fun Kontak.cetakInformasi() {
    println("Nama: $nama, Nomor Telepon: $nomorTelepon, Email: $email")
}

fun main() {

    val kontak = Kontak()

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
    
    println("\nMasukkan nama kontak yang ingin dihapus:")
    val namaHapus = readLine() ?: ""

    pengelola.hapusKontak(namaHapus)
    pengelola.tampilkanKontak()

    kontak.email
    kontak.nomorTelepon
    kontak.email
}
