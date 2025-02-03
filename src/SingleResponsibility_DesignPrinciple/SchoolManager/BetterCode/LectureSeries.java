package SingleResponsibility_DesignPrinciple.SchoolManager.BetterCode;
import java.util.List;
public class LectureSeries {
    private String title;
    private List<String> topics;
    private String schedule;

    public LectureSeries(String title, List<String> topics, String schedule) {
        this.title = title;
        this.topics = topics;
        this.schedule = schedule;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getTopics() {
        return topics;
    }

    public void setTopics(List<String> topics) {
        this.topics = topics;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }
}
