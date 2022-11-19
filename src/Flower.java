public class Flower {
    private String flowerColor;
    private String country;
    private float cost;

    private int lifeSpan;
    private String name;

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        this.flowerColor = flowerColor;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    Flower(String flowerColor, String country, float cost) {
        this();
        if (flowerColor == null || flowerColor.isEmpty() || flowerColor.isBlank()) {
            this.flowerColor = "Белый";
        } else {
            this.flowerColor = flowerColor;
        }

        if (country == null || country.isEmpty() || country.isBlank()) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
        if (cost <= 0) {
            this.cost = 1.00f;
        } else {
            this.cost = cost;
        }
        if (lifeSpan <= 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }

    }

    Flower() {
        name = "Цветок";
        lifeSpan = 0;
    }


    @Override
    public String toString() {
        return name + ". Цвет - " + getFlowerColor() + ". Страна происхождения - " + getCountry() + ". Стоимостью - " + getCost()
                + ". Срок стояния - " + lifeSpan + " дня/дней";
    }

}
