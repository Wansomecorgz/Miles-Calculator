public class Main {
    public static void main(String[] args) {

        int ticketPrice = 4359; // Цена билета
        int bonusMilePrice = 20; // Стоимость одной бонусной мили

        int miles = ticketPrice / bonusMilePrice;
        System.out.println("Количество начисленных бонусных миль: " + miles);
    }
}
