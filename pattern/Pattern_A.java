public class Pattern_A {
    public static void main(String[] args) {
        char input='A';
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(j == 1 || j == i || i == 4)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
