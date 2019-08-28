package net.rcarz;

import net.rcarz.jiraclient.BasicCredentials;
import net.rcarz.jiraclient.Issue;
import net.rcarz.jiraclient.JiraClient;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Great if you're having trouble setting up client or there are troubles authorizing your client
 */
public class ClientDemoTest {

    private static final String ISSUE_KEY = "TEST-1551";

    @Test
    @Ignore("Demo to use the JiraClient")
    public void demoUsingAgileClient() throws Exception {
        // Init with basic auth
//        final JiraClient jiraClient = new JiraClient(
//                new JiraClient(
//                        "https://jira.example.com/jira",
//                        new BasicCredentials("batman", "kapow")
//                )
//        );

        // Init client using API token
        final JiraClient jiraClient = new JiraClient(
                "https://jira.example.com/jira",
                new BasicCredentials("batman", "kapow")
        );

        demoIssue(jiraClient);
    }

    private static void demoIssue(JiraClient jiraClient) throws Exception {
        System.out.println("********** Issue demo");
        // Retrieve a specific Issue
        final Issue issue1 = jiraClient.getIssue(ISSUE_KEY);
        System.out.println(issue1);

        // Retrieve the issue attribute
        System.out.println("Project: " + issue1.getProject());
        System.out.println("Key: " + issue1.getKey());
        System.out.println("Description: " + issue1.getDescription());
        System.out.println("Comments: " + issue1.getComments());
        System.out.println("Time tracking: " + issue1.getTimeTracking());
        System.out.println("Issue type: " + issue1.getIssueType());
        System.out.println("Status: " + issue1.getStatus());
        System.out.println("Resolution: " + issue1.getResolution());
        System.out.println("Priority: " + issue1.getPriority());
        System.out.println("Assignee: " + issue1.getAssignee());
        System.out.println("Reporter: " + issue1.getReporter());
        System.out.println("Worklogs: " + issue1.getAllWorkLogs());
    }

}
