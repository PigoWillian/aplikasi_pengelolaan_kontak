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
                println("Nama: ${it.nama}, Nomor Telepon: ${it.nomorTelepon}, Email: ${it.email}")
            }
        } else {
            println("Daftar kontak kosong.")
        }
    }
}

fun Kontak.infoKontak(){
    println("Nama: ${nama}")
    println("No Tlp: ${nomorTelepon}")
    println("Email: ${email}")
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
