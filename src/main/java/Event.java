/**
 * Represents a task to be attended on a certain date. An <code>Event</code> object
 * corresponds to a task represented by a name, type and date.
 */
public class Event extends Task {

    /**
     * Type of task.
     */
    String type;

    /**
     * Date of event.
     */
    String date;

    /**
     * Class constructor assigning name, type and date to the object.
     * @param task_name The name of the event
     * @param date The date of the event
     */
    public Event(String task_name, String date) {
        super(task_name);
        type = "event";
        this.date = date;
    }

    /**
     * This method is used to get the type of the event task.
     * @return String This returns the type of the event task
     */
    @Override
    public String getType() {
        return type;
    }

    /**
     * This method is used to get the string representing the event task.
     * @return String This returns the string representing the event task
     */
    @Override
    public String getTypeIcon() {
        return "[E]";
    }

    /**
     * This method is used to get the date of the event task.
     * @return String This returns the string representing the date of the event
     */
    @Override
    public String getDate() {
        return date;
    }
}
