public class TipeDataPrimitive {
    public static void main(String[] args) {
        int age = 30;
        Integer ageObj = age;

        int ageAgain = ageObj;

        short shortData = ageObj.shortValue();
        byte byteData = ageObj.byteValue();
    }
}
