import java.util.ArrayList;

public class Project {
    private String name;
    private long estimatedTime;
    private ArrayList<Session> sessions;

    public Project(String name, long estimatedTime) {
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

    public void projectSummary() {
        System.out.println("Here's the summary of this project");
        System.out.println("Name: " + name);
        System.out.println("Estimated time: " + estimatedTime);
        System.out.println("Sessions: ");
        for (Session session : sessions) {
            System.out.println(session);
        }
    }
}
