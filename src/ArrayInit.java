public class ArrayInit {
    public static void main(String[] args) {
        String[] Siswa = {
                "Alif", "Razan", "Saputra"
        };
        System.out.println(Siswa[0]);

        int[] nilai = {
                1,2,3,4,5
        };

        System.out.println(nilai[2]);
        System.out.println(nilai.length);

//        Array 2 dimensi;

        String[][] keranjang = {
                { "Pensil", "Buku" },
                { "Penghapus", "Penggaris" },
        };

        System.out.println(keranjang[0][0]);
    }
}
