public class Main {
    public static void main(String[] args) {
        long[] sale = {3, 34, 66, 76, 89};
        SalesManager salesManager = new SalesManager(sale);
        long max = salesManager.max();
        System.out.println(max);
        System.out.println(salesManager.averageSales());
    }
}
