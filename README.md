import java.util.ArrayList; [pengimportan kelas menggunakan aray list untuk menyimpan list daftar pesanan]
import java.util.Scanner;[digunakan untuk membaca inputan dari pengguna]

public class KafeOrderr10 { [Di10"gunakan untuk pendefinisan kelas utama dengan menggunakan nama "kafe order]
    static class MenuItem { [Digunakan untuk menyimpan informasi tentang jumlah menu makanan dan minumam]
        String name; [Penggunaan variabel string digunakan untuk menyimpan nama menu yang akan dicantumkan]
        int price;[Penggunaan variabel INT digunakan untuk menyimpan jumlah harga yang ada pada menu]

        MenuItem(String name, int price) { [Digunakan untuk menginisalisai variabel nama dan harga,dengan nilai yang telah dicantumkan]
            this.name = name; [Menginisialisasikan variabel nama dengan nilai parameter name]
            this.price = price; [Menginisialisasikan Variabel harga dengan nilai parameter price]
        }
    }

    public static void main(String[] args) { [Mendefinisikan main methode pada titik awal program ini]
        Scanner scanner = new Scanner(System.in); [Digunakan untuk membuat objek Scanner untuk membaca input dari pengguna]

        MenuItem[] menu = { [Membuat array MenuItem yang berisi daftar item menu dan harga masing-masing.]
            new MenuItem("Nasi Goreng", 20000),
            new MenuItem("Mie Goreng", 15000),
            new MenuItem("Roti Bakar", 12000),
            new MenuItem("Kentang Goreng", 10000),
            new MenuItem("Teh Tarik", 8000),
            new MenuItem("Cappucino", 20000),
            new MenuItem("Chocolate Ice", 25000)
        };

        ArrayList<String> orderList = new ArrayList<>();[ Array list string digunakan untuk menyimpan daftrar pesanan user]
        ArrayList<Integer> orderPrices = new ArrayList<>(); [Array list INT digunakan untuk menyimpan harga setiap pesanan]

        while (true) { [Pemilihan ini digunakan,karena saya akan memberikan beberapa opsi,dan akan berjalan hingga user memilih untuk out]
            System.out.println("\n=== Selamat Datang di Kafe ==="); [Digunakan untuk menampilkan pesan SELAMAT DATANG DI KAFE pada terminal]
            System.out.println("=== Menu ==="); [untuk menampilkan judul menu]
            for (int i = 0; i < menu.length; i++) {
                System.out.println((i + 1) + ". " + menu[i].name + " - Rp" + menu[i].price); [Menampilkan nomor item menu, nama, dan harga]
            }

            System.out.println("\nPilih opsi berikut:"); [Menampilkan pesan untuk memilih opsi]
            System.out.println("1. Tambah Pesanan");[Menampilkan opsi untuk menambah pesanan.]
            System.out.println("2. Lihat Daftar Pesanan");[Menampilkan opsi untuk melihat daftar pesanan]
            System.out.println("3. Hitung Total Biaya");[Menampilkan opsi untuk menghitung total biaya]
            System.out.println("4. Selesai");[Menampilkan opsi untul selesai dan keluar dari program]

            System.out.print("Masukkan pilihan Anda: ");[Meminta user untuk memasukkan pilihannya]
            int choice = scanner.nextInt();[Digunakan untuk membaca hasil pilihan user,dan lanjut ke program selanjutnya]

            switch (choice) { [digunakan untuk memulai pernyataan switch yang telah dipilih oleh user]
                case 1:[ kode untuk pilihan Tambah pesanan]
                    System.out.print("Masukkan nomor menu yang ingin dipesan: ");[user diminta untuk memasukkan nomor menu yang akan di pesan]
                    int menuChoice = scanner.nextInt();[Membaca nomer menu yang akan dipesan]

                    if (menuChoice < 1 || menuChoice > menu.length) {[Mengecek apakah nomor menu yg dimasukkan benar/valid]
                        System.out.println("Pilihan menu tidak valid.");[Menampilkan pesan jika menu tidak benar/valid]
                        break;[Keluar dari blok switch jika nomor menu tidak valid]
                    }

                    System.out.print("Masukkan jumlah pesanan: "); [Meminta user untuk memasukkan jumlah pesanan]
                    int quantity = scanner.nextInt();[Membaca jumlah pesanan yang telah dimasukkan user]

                    String order = menu[menuChoice - 1].name + " x" + quantity;[Membuat string order dengan nama item menu dan jumlah pesanan]
                    int totalPrice = menu[menuChoice - 1].price * quantity;[Menghitung total harga dari pesanan yang sudah diinput oleh user]

                    orderList.add(order);[Digunakan untuyk menambah pesanan kedaftar pesanan]
                    orderPrices.add(totalPrice);[Menambahkan total harga pesanan ke daftar harga pesanan]

                    System.out.println(menu[menuChoice - 1].name + " berhasil ditambahkan ke pesanan.");[Menampilkan pesan bahwa pesanan berhasil ditambahkan.]
                    break;[Keluar dari blok switch]

                case 2:[blok untuk pilihan 2 LIHAT DAFTAR PESANAN]
                    System.out.println("\n=== Daftar Pesanan ===");[Menampilkan judul daftar pesanan]
                    int subtotal = 0;[inisialisaikan subtotal untuk menghitul total biaya sementara]
                    for (int i = 0; i < orderList.size(); i++) { [Memulai loop untuk iterasi melalui daftar pesanan]
                        System.out.println((i + 1) + ". " + orderList.get(i) + " - Rp" + orderPrices.get(i));[Menampilkan setiap pesanan dan harga]
                        subtotal += orderPrices.get(i);[Menambahkan harga pesanan pada subtotal]
                    }
                    System.out.println("Total Biaya Sementara: Rp" + subtotal);[Menampilkan total biaya sementara]
                    break;[Keluar dari blok switch]

                case 3:[blok untuk pilihan 3 TOTAL HARGA]
                    int total = 0; [Menginisialisasi var total dengan nil]
                    for (int price : orderPrices) {[Memulai loop for-each untuk iterasi melalui setiap elemen dalam orderPrices (daftar harga pesanan)]
                        total += price;[Menambahkan setiap harga pesanan (price) ke variabel total. Dengan ini, variabel total akan menyimpan jumlah total biaya dari semua pesanan]
                    }
                    System.out.println("Total biaya seluruh pesanan: Rp" + total);[Menampilkan total biaya seluruh pesanan dengan format teks ke layar]
                    break;[Keluar dari blok switch setelah selesai menghitung dan menampilkan total biaya]

                case 4:[blok untuk pilihan 4 SELESAI]
                    System.out.println("Terima kasih telah memesan. Selamat menikmati!");[Menampilkan pesan terima kasih kepada pengguna]
                    scanner.close();[Menutup Scanner untuk menghentikan pembacaan input.]
                    return;[Mengakhiri program]

                default:[Blok untuk pilihan tidak valid]
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");[Menampilkan pesan jika pengguna memilih opsi yang tidak valid]
            }
        }
    }
}