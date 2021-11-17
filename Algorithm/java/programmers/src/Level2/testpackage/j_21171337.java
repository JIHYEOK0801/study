package Level2.testpackage;

public class j_21171337 {
    public static void main(String[] args) {
        int []a = new int[10];
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }

        int [][]b = new int[10][10];
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[i].length;j++) {
                System.out.print(a[i]);
            }
            System.out.print("\n");
        }
    }
}
