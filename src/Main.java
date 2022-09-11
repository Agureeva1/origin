public class Main {
    public static void main(String[] args) {
      int[] sale = {3, 34, 66, 76, 89};
        SalesManager salesManager = new SalesManager (sale);
        int max = salesManager.max();
        System.out.println(max);
    }
}
