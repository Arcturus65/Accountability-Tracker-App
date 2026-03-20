import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProjectTracker projectTracker = new ProjectTracker();
        Scanner input = new Scanner(System.in);
        Project currentProject = null;
        Session currentSession = null;
        while (true) {
            System.out.println("What are we doing today?");
            System.out.println("1. Start new project.");
            System.out.println("2. Resume project.");
            System.out.println("3. End session");
            System.out.println("4. End project.");
            System.out.println("5. Quit");
            int userInput = input.nextInt();
            input.nextLine();
            if (userInput == 1) {
                System.out.println("Please enter the name of the project you would like to create:");
                String projectName = input.nextLine();
                System.out.println("Please enter the estimated time of your project:");
                long projectTime = input.nextLong();
                Project project = new Project(projectName, projectTime);
                projectTracker.addProject(project);
                System.out.println("Project with name " + projectName + " has been created.");
                System.out.println();
            } else if (userInput == 2) {
                System.out.println("Here are projects currently open. Please select one.");
                projectTracker.viewProjects();
                String projectName = input.nextLine();
                currentProject = projectTracker.findProject(projectName);
                if (currentProject != null) {
                    currentSession = new Session();
                    System.out.println("New session created for project " + projectName);
                    currentProject.addSession(currentSession);
                } else {
                    System.out.println("Project not found.");
                }
            } else if (userInput == 3) {
                if (currentSession != null) {
                    System.out.println("What did you work on?");
                    String userDescription = input.nextLine();
                    currentSession.stopSession(userDescription);
                    System.out.println("Session ended with the description: " + userDescription + " for a duration of " + currentSession.getDuration() + " seconds.");
                    currentSession = null;
                } else {
                    System.out.println("No active session for this project.");
                }
            } else if (userInput == 4) {
                System.out.println("Which project do you want to conclude?");
                String projectName = input.nextLine();
                currentProject = projectTracker.findProject(projectName);
                if (currentProject != null) {
                    currentProject.projectSummary();
                } else {
                    System.out.println("Project not found.");
                }
            } else {
                break;
            }
        }
    }
}
