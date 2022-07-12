public class continueAndBreak {
    public static void main(String[] args) {
        var counter = 0;
        while(true){
            System.out.println("Percobaan" + counter);
            counter++;
            if(counter > 10){
                break;
            }
        }

        for(var i = 0; i <= 30;i++){
            if(i % 2 == 0){
                continue;
            }
            System.out.println("Perulangan Bilangan Ganjil: " + i);
        }
    }
}
