public class Main {

    public static void main(String[] args) {
        Flower flower1 = new Flower(" ", "Голландия", 35.59f);
        flower1.name = "Роза обыкновенная";
        System.out.println(flower1);

        Flower flower2 = new Flower("", "", 15f);
        flower2.name = "Хризантема";
        flower2.lifeSpan = 5;
        System.out.println(flower2);

        Flower flower3 = new Flower("", "Англия", 69.9f);
        flower3.name = "Пион";
        flower3.lifeSpan = 1;
        System.out.println(flower3);

        Flower flower4 = new Flower("", "Турция", 19.5f);
        flower4.name = "Гипсофила";
        flower4.lifeSpan = 10;
        System.out.println(flower4);

        int percent = 10;
        int flower1Number = 3;
        int flower2Number = 5;
        int flower3Number = 1;
        int flower4Number = 0;
        float bunchCost = ((flower1.getCost() * flower1Number) + (flower2.getCost() * flower2Number) + (flower3.getCost() * flower3Number) +
                (flower4.getCost() * flower4Number)) * (percent/100f + 1);
        System.out.println(bunchCost);
    }
}
