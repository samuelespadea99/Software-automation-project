package Pack_mod4_task;
import java.util.HashMap;

public class TaskService {

    private HashMap<String, Task> taskMap = new HashMap<>();

    public void addTask(Task currentTask){

        if (taskMap.containsKey(currentTask.getTaskId ())){
            throw new IllegalArgumentException();
            
          }

        taskMap.put (currentTask.getTaskId(), currentTask );
        
       }

    public void deleteTask (String id){
        taskMap.remove(id);
      }

    public void updateName (String id, String name){
        Task task = taskMap.get(id);

        if (task !=null){
            task.setName(name);
      }
   }

    public void updateDescription (String id, String Details){
        Task task = taskMap.get(id);

        if (task != null) {
            task.setDescription(Details);
      }
    }

    public Task getTask (String id){
        return taskMap.get(id);
        
    }}

