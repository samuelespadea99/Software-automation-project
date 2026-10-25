package Pack_mod4_task;

public class Task {
	
	 private final String taskId;
	 private String description;
	 private String name;   
	 
	 public Task(String id, String Name, String Details){

	        if (id == null || id.length() > 10){
	          throw new IllegalArgumentException();
	        	
	        }
	        taskId = id;
	        
	        setDescription(Details);
	        setName(Name);
	         }

	    public String getTaskId(){
	        return taskId;
	   
	    }

	    public String getName(){
	        return name;
	    }

	    public String getDescription(){
	        return description;
	        
	    }

	    public void setName(String newName){
	        if (newName == null || newName.length()> 20){
	            throw new IllegalArgumentException();
	        }

	        name = newName;
	    }

	    public void setDescription(String newDescript){
	        if (newDescript == null ||newDescript.length()> 50) {
	            throw new IllegalArgumentException();
	            
	        }

	        description = newDescript;
	    }}