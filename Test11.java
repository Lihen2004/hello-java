public class Test11 {
    public static void main(String[] args) {
        printArrowHead(5);
    }

    public static void printArrowHead(int n) {
        if (n < 1) {
            System.out.println("n>0");
        }
        
        int x = 0;
        for(int i = 0; i < n; i++) {
            for(int k = (n-1); k > i; k--) {
                System.out.print(" ");
            }
            for(int j = 0; j <= x; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
            x+=2;
        }
    }
}