package homework7;

public class Main {

    public static void main(String[] args) {
        try {
            Tester.start(SmthTest.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}