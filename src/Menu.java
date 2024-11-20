public class Menu {

    private final String[] typesOfFoods = {"1.Seafood and Fishes", "2.Meat and Grills", "3.Pizza", "4.Sushi and Rolls"};

    private final String[] seafoodFish =   {"1.Okoy-Okoy", "2.Fisharon", "3.Ginataang Hipon", "4.King Crab Dishes", "5.Squid Sisig"};
    private final String[] meatGrills =    {"1.Korean BBQ", "2.Mixed Grills", "3.Schlachteplatte", "4.Seswaa", "5.Fricassee"};
    private final String[] pizza =         {"1.Neopolitan Pizza", "2.Chicago Pizza", "3.New York Style Pizza", "4.Sicilian Pizza", "5.Detroit Pizza"};
    private final String[] sushiRolls =    {"1.Tuna Roll", "2.Octopus", "3.Yellowtail Roll", "4.Bluefin Tuna", "5.Vegetable Roll"};

    private final int[] seafoodFishPrice = {100, 75, 100, 125, 95};
    private final int[] meatGrillsPrice = {100, 65, 85, 75, 100};
    private final int[] pizzaPrice = {100, 100, 100, 100, 100};
    private final int[] sushiRollsPrice = {85, 85, 95, 110, 70};

    public String[] getTypesOfFoods() {
        return typesOfFoods;
    }

    public String[] getSeafoodFish() {
        return seafoodFish;
    }

    public int[] getSeafoodFishPrice() {
        return seafoodFishPrice;
    }

    public String[] getMeatGrills() {
        return meatGrills;
    }

    public int[] getMeatGrillsPrice() {
        return meatGrillsPrice;
    }

    public String[] getPizza() {
        return pizza;
    }

    public int[] getPizzaPrice() {
        return pizzaPrice;
    }

    public String[] getSushiRolls() {
        return sushiRolls;
    }

    public int[] getSushiRollsPrice() {
        return sushiRollsPrice;
    }

    public void callTypeOfFoods(String[] typesOfFoods) {
        for(String types:typesOfFoods) {
            System.out.println(types);
        }
    }

    public void callSeafoodFish(String[] seafoodFish) {
        System.out.println("\n\t----------Seafood & Fish----------");
        for(int i=0; i<seafoodFish.length; i++) {
            System.out.printf("%-30s $ %2d\n",seafoodFish[i], seafoodFishPrice[i]);
        }
    }

    public void callMeatGrills(String[] meatGrills) {
        System.out.println("\n\t----------Meat & Grills----------");
        for(int i=0; i<meatGrills.length; i++) {
            System.out.printf("%-30s $ %2d\n",meatGrills[i], meatGrillsPrice[i]);
        }
    }

    public void callPizza(String[] pizza) {
        System.out.println("\n\t\t----------Pizza----------");
        for(int i=0; i<pizza.length; i++) {
            System.out.printf("%-30s $ %2d\n",pizza[i], pizzaPrice[i]);
        }

    }

    public void callSushiRolls(String[] sushiRolls) {
        System.out.println("\n\t----------Sushi & Rolls----------");
        for(int i=0; i<sushiRolls.length; i++) {
            System.out.printf("%-30s $ %2d\n",sushiRolls[i],sushiRollsPrice[i]);
        }
    }

}
