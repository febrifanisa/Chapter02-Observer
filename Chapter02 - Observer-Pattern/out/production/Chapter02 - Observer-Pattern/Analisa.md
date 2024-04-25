Analisa Observer

Interface:
- Observer: Interface ini mendefinisikan method receiveNotification(String msg) yang digunakan untuk menerima notifikasi. 
- Observable: Interface ini mendefinisikan method untuk mengelola subscriber (pengguna yang berlangganan) seperti addSubscriber(User user), removeSubscriber(User user), dan notifyUser(String msg) untuk mengirim notifikasi ke subscriber. 

Kelas:
- User: Kelas ini menampilkan pengguna yang dapat berlangganan channel. 
  - Ia mengimplementasikan interface Observer dan memiliki method subscribe(Channel channel) untuk berlangganan ke channel, 
  - unsubscribe(Channel channel) untuk berhenti berlangganan, dan 
  - getName() untuk mendapatkan nama pengguna. 
- Channel: Kelas ini menampilkan channel yang dapat memiliki subscriber dan mengirimkan notifikasi. Ia mengimplementasikan interface Observable dan memiliki method untuk mengelola subscriber serta notifyUser(String msg) untuk mengirim notifikasi ke semua subscriber yang terdaftar. 

Kelas Main: 
- program membuat objek Channel dengan nama "Budi Setiawan Channel". 
- Program membuat tiga objek User dengan nama "Wika Wika", "Jobot TV", dan "Jinjit Karunia". 
- User "Wika Wika" dan "Jobot TV" berlangganan ke channel "Budi Setiawan Channel". 
- Channel "Budi Setiawan Channel" mengirimkan notifikasi "Ada video baru buat anda! Jangan lupa di subscribe ya!" ke semua subscriber yang terdaftar (Wika Wika dan Jobot TV). 
- User "Jinjit Karunia" berlangganan ke channel "Budi Setiawan Channel". 
- Channel "Budi Setiawan Channel" mengirimkan notifikasi "Video baru!" ke semua subscriber yang terdaftar (sekarang termasuk Jinjit Karunia).
