public class MethodOverloading {
    public static void main(String[] args) {
    String hallo1 = sayHallo();
        String hallo2 =  sayHallo("Alif");
        String hallo3 =      sayHallo("Rizky", "Alif");

        System.out.println(hallo1);
        System.out.println(hallo2);
        System.out.println(hallo3);
    }

    private static String sayHallo(){
        return "Halooo";
    }

    private static String sayHallo(String name){
        return name + ", Hallo";
    }

    private static String sayHallo(String name1, String name2){
        return "Hallo " + name1 + ".. Haii " + name2;
    }
}
