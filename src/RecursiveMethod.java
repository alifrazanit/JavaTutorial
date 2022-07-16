public class RecursiveMethod {
    public static void main(String[] args) {
//        System.out.println(factorialLoop(2));
//        System.out.println(factorialRecursive(2));
        Looping(100);
    }

    static int factorialLoop(int value){
        var result = 1;
        for(var counter = 1; counter <= value; counter++){
            result *= counter;
        }
        return result;
    }

    static int factorialRecursive(int nilai){
        if(nilai == 1){
            return 1;
        } else {
            return nilai * factorialRecursive(nilai - 1);
        }
    }

    static void Looping(int value){
        if(value == 0){
            System.out.println("SELESAI");
        } else {
            System.out.println("Loop " + value);
            Looping(value - 1);
        }
    }
}
