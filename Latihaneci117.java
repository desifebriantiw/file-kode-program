import java.util.Scanner;
public class Latihaneci117 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] sales = new double[12];
        String[] months = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        
        // Input penjualan bulanan
        for (int i = 0; i < 12; i++) {
            System.out.print("Masukkan total penjualan untuk " + months[i] + ": ");
            sales[i] = scanner.nextDouble();
        }
        scanner.close();
        
        // Menghitung total penjualan tahunan
        double totalSales = 0;
        for (double sale : sales) {
            totalSales += sale;
        }
        
        // Mencari bulan dengan penjualan tertinggi dan terendah
        double maxSales = sales[0], minSales = sales[0];
        int maxMonth = 0, minMonth = 0;
        
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] > maxSales) {
                maxSales = sales[i];
                maxMonth = i;
            }
            if (sales[i] < minSales) {
                minSales = sales[i];
                minMonth = i;
            }
        }
        
        // Menghitung rata-rata penjualan
        double averageSales = totalSales / 12;
        
        // Menghitung persentase kenaikan/penurunan per bulan
        System.out.println("\nAnalisis Penjualan Bulanan:");
        System.out.printf("Total penjualan tahunan: %.2f\n", totalSales);
        System.out.printf("Rata-rata penjualan per bulan: %.2f\n", averageSales);
        System.out.println("Bulan dengan penjualan tertinggi: " + months[maxMonth] + " (" + maxSales + ")");
        System.out.println("Bulan dengan penjualan terendah: " + months[minMonth] + " (" + minSales + ")");
        
        System.out.println("\nPersentase Kenaikan/Penurunan Penjualan per Bulan:");
        for (int i = 1; i < sales.length; i++) {
            double percentageChange = ((sales[i] - sales[i - 1]) / sales[i - 1]) * 100;
            System.out.printf("Dari %s ke %s: %.2f%%\n", months[i - 1], months[i], percentageChange);
        }
    }
}
