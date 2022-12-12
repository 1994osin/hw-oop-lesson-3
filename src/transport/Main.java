package transport;

import transport.Bus;
import transport.Train;
import transport.Transport;

public class Main {
    public static void main(String[] args) {
        Transport lastochka = new Train(
                "Ласточка",
                "B-901",
                2011,
                "Россия",
                null,
                301,
                "дизель",
                60,
                3500,
                0,
                "Белорусский вокзал",
                "Минск-Пассажирский",
                11);

        Transport leningrad = new Train(
                "Ленинград",
                "D-125",
                2019,
                "Россия",
                null,
                270,
                "дизель",
                89,
                1700,
                0,
                "Ленинградский вокзал",
                "Ленинград-Пассажирский",
                8);

        System.out.println(lastochka.toString());
        System.out.println(leningrad.toString());

        Transport liaz = new Bus(
                "Лиаз",
                "5256",
                2016,
                "Россия",
                "синий",
                140,
                "дизель",
                14);

        Transport man = new Bus(
                "MAN",
                "Lion's Sity",
                2020,
                "Германия",
                "черный",
                150,
                "дизель",
                89);

        Transport volvo = new Bus(
                "VOLVO",
                "Люкс'бус 9900",
                2022,
                "Германия",
                "желтый",
                160,
                "дизель",
                100);

        System.out.println(liaz.toString());
        System.out.println(man.toString());
        System.out.println(volvo.toString());
    }
}
