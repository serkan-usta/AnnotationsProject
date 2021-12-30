
@FunctionalInterface
interface Functionable {
    void performSomeFunction();
}

public class BuiltInAnnotations implements Functionable {
    public static void main(String[] args) {
        new BuiltInAnnotations().performSomeFunction();
    }

    @Override
    public void performSomeFunction() {
        System.out.println("Overrode Functionable's method");
    }

}