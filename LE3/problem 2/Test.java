public class Test implements Testable {
    @Override
    public void display() {
        System.out.println("Displaying Test class");
    }
    public static void main(String[] args) {
        Test testObj = new Test();
        testObj.display();
    }
}
