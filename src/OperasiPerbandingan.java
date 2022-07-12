public class OperasiPerbandingan {
    public static void main(String[] args) {
        int nilai = 100;
        String hasilUjian = "";
        if(nilai <= 100 && nilai >= 90){
            hasilUjian = "Lulus dengan nilai A";
        } else if(nilai <= 89 && nilai >= 80){
            hasilUjian = "Lulus dengan nilai B";
        } else if(nilai <= 79 && nilai >= 70){
            hasilUjian = "Lulus dengan nilai C";
        } else if(nilai <= 69 && nilai >= 60){
            hasilUjian = "Maaf kamu tidak lulus dengan nilai D";
        } else if(nilai <= 59 && nilai >= 50){
            hasilUjian = "Maaf kamu tidak lulus dengan nilai E";
        } if(nilai <= 49){
            hasilUjian = "Maaf kamu tidak lulus dengan nilai F";
        }

        System.out.println(hasilUjian);
    }
}
