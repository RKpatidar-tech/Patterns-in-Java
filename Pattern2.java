public class Pattern2 {
    public static void main(String[] args) {
        int i, j, k;
        for (i = 1; i <= 5; i++) {
          
            for (j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for(k=1;k<=i;k++){
                System.out.print("*");//with space or without space check the pattern first
            }
           
            System.out.println("");
        }
    }
}
