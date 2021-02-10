public final class Timer {
    private static Timer instance;
    int value;

    private Timer(int value) {
        this.value = value;
    }

    public static Timer getInstance(int value) {
        if (instance == null){
            instance = new Timer(value);
        }
        return instance;
    }
}