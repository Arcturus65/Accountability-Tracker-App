import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class DataSaver {
    public static void projectWriter(ProjectTracker projects) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("src/Projects.txt", false));
        for (Project project : projects.getProjects()) {
            writer.write("PROJECT:" + project.getName() + ":" + project.getEstimatedTime());
            writer.newLine();
            for (Session session :  project.getSessions()) {
                writer.write("SESSION:" + session.getDescription() + ":" + session.getDuration());
                writer.newLine();
            }
            writer.newLine();
        }
        writer.close();
    }
}
