public class Main {
    public static void main(String[] args) {
        /* Задание 1-1, 1-2
        System.out.println("Задание 1-1, 1-2");
        Human maksim = new Human();
        maksim.yearOfBirth = 1988;
        maksim.name = "Максим";
        maksim.town = "Минск";
        maksim.jobTitle = "бренд-менеджер";
        System.out.println(maksim);

        Human ann = new Human();
        maksim.yearOfBirth = 1993;
        maksim.name = "Аня";
        maksim.town = "Москва";
        ann.jobTitle = "методист образовательных програм";
        System.out.println(ann);

        Human kate = new Human();
        maksim.yearOfBirth = 1992;
        maksim.name = "Катя";
        maksim.town = "Калининград";
        kate.jobTitle = "продакт-менеджер";
        System.out.println(kate);

        Human artem = new Human();
        maksim.yearOfBirth = 1995;
        maksim.name = "Артем";
        maksim.town = "Москва";
        artem.jobTitle = "директор по развитию бизнеса";
        System.out.println(artem);
        System.out.println();

        Задание 1-3
        System.out.println("Задание 1-3");
        Car ladaGranta = new Car();
        ladaGranta.brand = "Lada";
        ladaGranta.model = "Granta";
        ladaGranta.engineVolume = 1.7;
        ladaGranta.color = "желтый";
        ladaGranta.year = 2015;
        ladaGranta.country = "Россия";
        System.out.println(ladaGranta);

        Car audiA8 = new Car();
        audiA8.brand = "Audi";
        audiA8.model = "A8 50 L TDI quattro";
        audiA8.engineVolume = 3.0;
        audiA8.color = "черный";
        audiA8.year = 2020;
        audiA8.country = "Германия";
        System.out.println(audiA8);

        Car bmwZ8 = new Car();
        bmwZ8.brand = "BMW";
        bmwZ8.model = "Z8";
        bmwZ8.engineVolume = 3.0;
        bmwZ8.color = "черный";
        bmwZ8.year = 2021;
        bmwZ8.country = "Германия";
        System.out.println(bmwZ8);

        Car kiaSportage = new Car();
        kiaSportage.brand = "Kia";
        kiaSportage.model = "Sportage 4 поколение";
        kiaSportage.engineVolume = 2.4;
        kiaSportage.color = "красный";
        kiaSportage.year = 2018;
        kiaSportage.country = "Южная Корея";
        System.out.println(kiaSportage);

        Car hyundaiAvante = new Car();
        hyundaiAvante.brand = "Hyundai";
        hyundaiAvante.model = "Avante";
        hyundaiAvante.engineVolume = 1.6;
        hyundaiAvante.color = "оранжевый";
        hyundaiAvante.year = 2016;
        hyundaiAvante.country = "Южная Корея";
        System.out.println(hyundaiAvante);*/

        // Задание 2-1
        System.out.println("Задание 2-1");
        Human maksim = new Human(-5, "Максим", "Минск", "бренд-менеджер");
        Human ann = new Human(1993, "", null, "методист образовательных програм");
        Human kate = new Human(1992, "Катя", "", null);
        Human artem = new Human(1995, null, "Москва", "");
        System.out.println(maksim);
        System.out.println(ann);
        System.out.println(kate);
        System.out.println(artem);
        System.out.println();

        // Задание 2-2
        System.out.println("Задание 2-2");
        Car ladaGranta = new Car("",null, 1.7,"желтый",
                2015, "Россия");
        Car audiA8 = new Car("Audi","", 3.0,null,
                2020, "Германия");
        Car bmwZ8 = new Car("BMW","Z8", -5.3,"черный",
                2021, null);
        Car kiaSportage = new Car("Kia","Sportage 4-го поколения", 2.4,"красный",
                2018, "");
        Car hyundaiAvante = new Car("Hyundai","Avante", 1.6,"оранжевый",
                -101, "Южная Корея");
        System.out.println(ladaGranta);
        System.out.println(audiA8);
        System.out.println(bmwZ8);
        System.out.println(kiaSportage);
        System.out.println(hyundaiAvante);
    }
}