import java.util.ArrayList;

public class Project {
    private String name;
    private long estimatedTime;
    private ArrayList<Session> sessions;

    public Project(long estimatedTime, String name) {
        this.estimatedTime = estimatedTime;
        this.name = name;
        this.sessions = new ArrayList<>();
    }
//  Getters for class fields.
    public String getName() {
        return name;
    }

    public long getEstimatedTime() {
        return estimatedTime;
    }

    public ArrayList<Session> getSessions() {
        return sessions;
    }

//    Add session method
    public void addSession(Session session) {
        sessions.add(session);
    }
}
