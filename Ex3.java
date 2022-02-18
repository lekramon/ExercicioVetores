public class Ex3 {

    public static void main(String[] args) {
        int[] a = { 7, 2, 5, 8, 4 };
        int[] b = { 4, 2, 9, 5 };

        String res = interseccao(a, b);
        System.out.println(res);

    }

    public static String interseccao(int[] a, int[] b) {
        String res = "";
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    res += a[i] + " ";
                }
            }
        }
        return res;
    }

}
