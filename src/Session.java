public class Session {
    private String description;
    private long startTime;
    private long duration;
    private boolean isActive;

//  Constructor

    public Session() {
        description = "";
        startTime = System.currentTimeMillis();
        duration = 0;
        isActive = true;
    }
// Creating stopSession method

    public void stopSession(String description) {
        this.description = description;
        long endTime = System.currentTimeMillis();
        duration = (endTime - startTime) / 1000;
        isActive = false;
    }

//  Creating getters for all fields.

    public String getDescription() {
        return description;
    }

    public long getStartTime() {
        return startTime;
    }

    public long getDuration() {
        return duration;
    }

    public boolean isActive() {
        return isActive;
    }
}
