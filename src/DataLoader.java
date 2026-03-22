import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DataLoader {
    public static ArrayList<Project> loadProjects() throws IOException {
        ArrayList<Project> projects = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader("src/Projects.txt"));
        String line;
        Project currentProject = null;
        while ((line = reader.readLine()) != null) {
            if (line.startsWith("PROJECT:")) {
                String[] parts = line.split(":");
                currentProject = new Project(parts[1], Long.parseLong(parts[2]));
                projects.add(currentProject);
            }
            else if (line.startsWith("SESSION:")) {
                String[] parts = line.split(":");
                Session currentSession = new Session(parts[1], Long.parseLong(parts[2]));
                currentProject.addSession(currentSession);
            }
        }
        return projects;
    }
}
