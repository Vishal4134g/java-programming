public class function1 {
    public static void main(String[] args) {
        printfirstpattern();
    }
    public static void printfirstpattern() {
        int row = 0;
        while(row < 5) {
            int col = 0;
            while( col <= row) {
                System.out.print(" *");
                col++;  
            }
            System.out.println();
            row++;  
        }
    }
}