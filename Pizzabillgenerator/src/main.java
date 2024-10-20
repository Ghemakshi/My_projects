public class main {
    public static void main(String[] args) {
        Pizza basePizza = new Pizza(true);
        basePizza.addExtraToppings();
        basePizza.addExtraCheese();
        basePizza.takeAway();
        basePizza.getBill();

        DeluxePizza dp = new DeluxePizza(false);
        dp.takeAway();
        dp.getBill();
    }
}
