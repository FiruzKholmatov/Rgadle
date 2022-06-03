package ru.netology;

public class CashbackHackService {
    private final int boundary = 1000;

    public int remain(int amount) {
        if (boundary - amount % boundary == 1000) {
            return 0;
        } else {
            return boundary - amount % boundary;
        }
    }

}
