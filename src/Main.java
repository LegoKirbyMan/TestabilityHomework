public class Main {
    public static void main(String[] args) {

        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculateBonus(price); // должно получиться 500
        System.out.println(miles);

        System.out.println("Цена билета: " + price);
        System.out.println((miles) + " бонусных миль начислено.");
        // Рассчитываете количество бонусных миль, используя
        // значения заведённых переменных. Ответ сохраняете в
        // новую переменную и выводите на экран
    }
}