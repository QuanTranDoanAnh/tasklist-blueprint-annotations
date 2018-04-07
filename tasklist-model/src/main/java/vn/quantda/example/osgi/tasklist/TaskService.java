package vn.quantda.example.osgi.tasklist;

import java.util.Collection;

public interface TaskService {
	Task getTask(String id);
	void addTask(Task task);
	void updateTask(Task task);
	void deleteTask(String id);
	Collection<Task> getTasks();
}
