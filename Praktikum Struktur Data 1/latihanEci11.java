public class latihanEci11 {
    public static void main(String[] args) {
        // deklrasi dan inisialisasi
        int[] number = new int[5];
        // inisialisasi
        number[0]=1;
        number[1]=2;
        number[2]=3;
        number[3]=4;
        number[4]=5;

        //Menggunakan for loop
        //for (int i = 0; i < number.length; i++) {
        //  System.out.print(number[i]);
        //}

        // soal 1
        // for (int i = 0; i < number.length; i++) {
        //         System.out.print(number[i]+" ");     
        // }


        // soal 2
        // for (int i = 0; i < number.length; i++) {
        //         System.out.print(number[i]);  
        //         if (i<4) {
        //                 System.out.print(",");
        //     }     
        // }

        // soal 3
        // for (int i = 0; i < number.length; i++) {
        //     if (i%2==0) {
        //         System.out.print(number[i]);  
        //         if (i<4) {
        //                 System.out.print(",");
        //             } 
        //     }     
        // }

        // soal 4
        // for (int i = 4; i > -1; i--) {
        //     if (i%2==0) {
        //         System.out.print(+number[i]); 
        //         if (i>1) {
        //             System.out.print(",");
        //         }
        //     } 
        // }

        // soal 5
        // for (int i = 0; i < number.length; i++) {
        //     if (i%2==1) {
        //         System.out.print(+number[i]);  
        //         if (i<2) {
        //             System.out.print(",");
        //         } 
        //     }     
        // }

        
        //soal 6
        System.out.println();
        System.out.print(number[0] + "," + number[0] + ","); 
        System.out.print(number[2] + "," + number[1] + "," + number[4]);

    }
}
