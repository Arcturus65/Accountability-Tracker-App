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
        long totalDuration = 0;
        for (int i = 0; i < sessions.size(); i++) {
            System.out.println("Session " + (i + 1) + ": " + sessions.get(i).getDescription());
            totalDuration += sessions.get(i).getDuration();
        }
        System.out.println("You've worked on this project for " + totalDuration + "minutes");

        if (estimatedTime > totalDuration) {
            System.out.println("You managed to complete the project " + name + " in less than " + estimatedTime + " minutes");
        } else if (estimatedTime == totalDuration) {
            System.out.println("You managed to complete the project " + name + " in " + estimatedTime +  " minutes");
        } else {
            long deltaTime = totalDuration - estimatedTime;
            System.out.println("You exceeded the initial estimation by " + deltaTime);
        }
    }
}
