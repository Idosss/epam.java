package kz.epam.gabdollin.practice.Trains;

public class Train {
    public void transferPassengers(int passengersNumber, int wagonNumber) {
        int enginePower;
        int massOfWagon = passengersNumber * 80;

        enginePower = massOfWagon * wagonNumber;

        if (enginePower < 100000) {
            System.out.println("Train is ready to go. Please Fasten your seat belts");
        } else System.out.println("Sorry,we can't go, to many passengers 'Кому нибудь придется ехать на такси!'");
    }
    public void transferProduct(int massOfWagon, int wagonNumber) {
        int enginePower;
        enginePower = massOfWagon * wagonNumber;

        if (enginePower < 15000) {
            System.out.println("Train is ready to transfer wagons");
        } else System.out.println("Trains engine power isn't able to transfer this wagons");
    }


}
