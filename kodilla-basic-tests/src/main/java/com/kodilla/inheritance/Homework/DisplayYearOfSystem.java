package com.kodilla.inheritance.Homework;

public class DisplayYearOfSystem {

    public static void main(String[] args) {

        OperatingSystem operatingSystem = new OperatingSystem(1955);

        operatingSystem.turnOn();
        Windows windows = new Windows(1985);
        windows.displayYarOfPublish();
        Linux linux = new Linux(1991);
        linux.displayYarOfPublish();

    }

}
