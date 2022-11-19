public class Main {

    public static void main(String[] args) {

        Flower[] flowers = createFlowers();

        for (Flower flower : flowers) {
            System.out.println(flower.getName());
        }

        int bunchLife = findMinLifeSpan(flowers);
        float cost = findCost(flowers);
        System.out.println("Стоимость букета - " + cost + ". Срок жизни букета - " + bunchLife + " день/дня/дней");

    }


    private static float findCost(Flower[] flowers) {

        float cost = 0;
        for (int i = 0; i < flowers.length; i++) {
            cost += flowers[i].getCost();
        }
        int percent = 10;
        cost = cost * (percent / 100f + 1);
        return cost;
    }

    private static int findMinLifeSpan(Flower[] flowers) {
        int minSpan = flowers[0].getLifeSpan();
        for (int i = 0; i < flowers.length; i++) {
            if (minSpan > flowers[i].getLifeSpan()) {
                minSpan = flowers[i].getLifeSpan();
            }
        }
        return minSpan;
    }

    private static Flower[] createFlowers() {

        Flower flower1 = new Flower(" ", "Голландия", 35.59f);
        flower1.setName("Роза обыкновенная");
        System.out.println(flower1);

        Flower flower2 = new Flower("", "", 15.00f);
        flower2.setName("Хризантема");
        flower2.setLifeSpan(5);
        System.out.println(flower2);

        Flower flower3 = new Flower("", "Англия", 69.90f);
        flower3.setName("Пион");
        flower3.setLifeSpan(1);
        System.out.println(flower3);

        Flower flower4 = new Flower("", "Турция", 19.50f);
        flower4.setName("Гипсофила");
        flower4.setLifeSpan(10);
        System.out.println(flower4);

        int flower1Number = 3;
        int flower2Number = 5;
        int flower3Number = 1;
        int flower4Number = 3;
        int sum = flower1Number + flower2Number + flower3Number + flower4Number;
        Flower[] flowers = new Flower[sum];

        int start = 0;
        int end = start + flower1Number;

        insertFlower(start, end, flowers, flower1);


        start = end;
        end = start + flower2Number;

        insertFlower(start, end, flowers, flower2);
        start = end;
        end = start + flower3Number;

        insertFlower(start, end, flowers, flower3);

        start = end;
        end = start + flower4Number;
        insertFlower(start, end, flowers, flower4);


        return flowers;
    }

    private static void insertFlower(int start, int end, Flower[] flowers, Flower flower) {

        for (int i = start; i < end; i++) {
            flowers[i] = flower;
        }
    }


}
