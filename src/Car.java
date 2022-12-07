public class Car {
    private final String brand;
    private final String model;
    private final double engineVolume;
    private String color;
    private final int year;
    private final String country;

    public Car(String brand, String model, double engineVolume, String color, int year, String country) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            brand = "default";
        }
        this.brand = brand;
        if (model == null || model.isEmpty() || model.isBlank()) {
            model = "default";
        }
        this.model = model;
        if (engineVolume <= 0) {
            engineVolume = 1.5;
        }
        this.engineVolume = engineVolume;
        if (color == null || color.isEmpty() || color.isBlank()) {
            color = "белый";
        }
        this.color = color;
        if (year <= 0) {
            year = 2000;
        }
        this.year = year;
        if (country == null || country.isEmpty() || country.isBlank()) {
            country = "default";
        }
        this.country = country;
    }

    @Override
    public String toString() {
        return "Автомобиль: Марка " + brand + ", " + "Модель " + model + ", " + " Объем двигателя в литрах " +
                engineVolume + ", " + " Цвет кузова " + color + ", " + " Год производства " + year + ", " +
                " Страна сборки " + country;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }
}
