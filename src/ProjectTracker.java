import java.util.ArrayList;

public class ProjectTracker {
    private ArrayList<Project> projects;

    public ProjectTracker() {
        this.projects = new ArrayList<>();
    }

    public ArrayList<Project> getProjects() {
        return projects;
    }

    public void addProject(Project project) {
        projects.add(project);
    }

    public void viewProjects() {
        if  (projects.size() == 0) {
            System.out.println("There are no projects to view");
        } else {
            for (Project project : projects) {
                System.out.println(project.getName());
            }
        }
    }

    public Project findProject(String projectName) {
        for (Project project : projects) {
            if (project.getName().equals(projectName)) {
                return project;
            }
        }
        return null;
    }

    public void projectLoader(ArrayList<Project> projects) {
        this.projects.addAll(projects);
    }

}
