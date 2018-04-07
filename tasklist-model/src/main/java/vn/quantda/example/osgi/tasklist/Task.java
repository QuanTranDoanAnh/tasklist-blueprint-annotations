package vn.quantda.example.osgi.tasklist;

import java.io.Serializable;
import java.util.Date;

public class Task implements Serializable {

	/**
	 * Only needed for ECF generic transport 
	 */
	private static final long serialVersionUID = -880399632773010056L;

	String id;
	String title;
	String description;
	Date dueDate;
	boolean finished;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	public boolean isFinished() {
		return finished;
	}
	public void setFinished(boolean finished) {
		this.finished = finished;
	}
}
