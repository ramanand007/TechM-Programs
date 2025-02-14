package org.anurag;

public class Sin {
    private static Sin instance;

    private Sin() {}

    public static synchronized Sin getInstance() {
        if (instance == null) {
            instance = new Sin();
        }
        return instance;
    }
}
