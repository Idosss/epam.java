package kz.epam.gabdollin.practice.Trains;

import kz.epam.gabdollin.practice.Trains.Train;

public class TrainTester {
    public static void main(String[] args) {
        Train passengersTrain = new Train();
        passengersTrain.transferPassengers(20,10);
        Train freightTrain = new Train();
        freightTrain.transferProduct(250,15);

        }

}

