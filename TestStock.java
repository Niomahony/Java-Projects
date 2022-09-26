public class TestStock {
    public static void main(String[] args) {
        Stock LKSS = new Stock("LKSS", "Limerick Software Solutions", 79.45, 79.65);
        System.out.println("Name: " + LKSS.getName());
        System.out.println("Percentage change: " + LKSS.getChangePercent());
    }
}
