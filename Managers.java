package Tracker_v2;

public class Managers {
    public static InMemoryTaskManager getDefault() {
        return new InMemoryTaskManager();
    }
}
