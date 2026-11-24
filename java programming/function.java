public class function{
    public static void main(String[] args) {
        System.out.print("function calls : ");
        // Call the function here
        greetUser();
        System.out.print("Function called again : ");
        greetUser();
    }
    public static void greetUser() {
        System.out.println("Hello user, Welcome to the program.");
    }
}