public class MethodVariableArgument {
    public static void main(String[] args) {
        int[] nilai = {90, 90, 90};
        sayCongrats("Alif", nilai);
        sayCongratsVariableArgument("Ujang", 80,80,80);
    }

    private static void sayCongrats(String name,int[] values){
        var total = 0;
        for(var value : values){
            total += value;
        }
        var finalValue = total / values.length;

        if(finalValue >= 75){
            System.out.println("Selamat " + name +" Anda Lulus");
        } else {
            System.out.println("Maaf "+ name +" Anda Tidak Lulus");
        }
    }
    private static void sayCongratsVariableArgument(String name,int ...values){
        var total = 0;
        for(var value : values){
            total += value;
        }
        var finalValue = total / values.length;

        if(finalValue >= 75){
            System.out.println("Selamat " + name +" Anda Lulus");
        } else {
            System.out.println("Maaf "+ name +" Anda Tidak Lulus");
        }
    }
}
