package Book_2.Chapter_8;

public class MyException {

    public static void main(String[] args) {
        try {
            doSomething();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void doSomething() throws Exception {
        String name = "N";
        if (name.length() < 2) {
            throw new Exception("Name is too short.");
        }
    }

}
