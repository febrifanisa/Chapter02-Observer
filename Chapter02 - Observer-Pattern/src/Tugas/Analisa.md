Analisa Tugas (Subject)

Interface:
- Subject: Interface ini mendefinisikan fungsionalitas inti dari subjek yang dapat diamati. 
   - registerObserver(Observer observer): berfungsi untuk mendaftarkan observer (pengamat) baru. 
   - removeObserver(Observer observer): berfungsi untuk menghapus observer yang sudah terdaftar. 
   - notifyObservers(String notification): berfungsi untuk memberitahu semua observer yang terdaftar tentang adanya perubahan (notifikasi). 
- Observer: Interface ini mendefinisikan fungsionalitas yang harus dimiliki oleh sebuah observer. 
  - update(String notification): berfungsi untuk memperbaharui observer dengan notifikasi yang diberikan subjek.

Kelas:
- Instagram: Kelas ini mengimplementasikan interface Subject. Ia berperan sebagai subjek yang dapat diamati, dalam hal ini akun Instagram. 
  - observers: List yang berisi objek-objek observer yang terdaftar untuk menerima notifikasi dari akun Instagram.
  - username: String yang menyimpan nama pengguna akun Instagram. 
  - postPhoto(String caption): Fungsi ini digunakan untuk memposting foto baru. Fungsi ini akan membuat notifikasi yang berisi username dan caption foto. Kemudian, fungsi ini akan memanggil notifyObservers untuk memberitahu semua observer yang terdaftar.
- User: Kelas ini mengimplementasikan interface Observer. Ia berperan sebagai observer (pengamat) yang akan menerima notifikasi dari subjek (Instagram).
  - name: String yang menyimpan nama pengguna observer.
  - update(String notification): Fungsi ini dipanggil ketika observer menerima notifikasi. Fungsi ini akan menampilkan pesan yang berisi nama pengguna observer dan notifikasi yang diterima.

Kelas Main:
  - Kelas Main digunakan untuk menjalankan program dan menunjukkan penggunaan pola Observer Pattern. 
  - Objek Instagram baru dibuat dengan nama pengguna "john_doe".
  - Objek User baru dibuat dengan nama "jane_doe" dan "bob_jones".
  - User tersebut didaftarkan sebagai observer untuk akun Instagram.
  - Akun Instagram memposting foto pertama dengan caption "Cantiknya Matahari Terbenam di Laut". Notifikasi akan diterima oleh kedua user.
  - User "jane_doe" kemudian dihapus dari daftar observer. 
  - Akun Instagram memposting foto kedua dengan caption "Mencoba resep baru". Notifikasi hanya akan diterima oleh user "bob_jones" karena user "jane_doe" sudah dihapus.