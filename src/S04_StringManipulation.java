public class S04_StringManipulation {
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = new String("java");

        // 10. satir
        if (str2.equals(str1.toLowerCase())) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");

        }

    }
}