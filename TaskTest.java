package Pack_mod4_task;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TaskTest {

	@Test
	public void testTaskCreation(){

        Task task = new Task("55533", "Work", "Complete task");

        assertEquals("55533", task.getTaskId());
        assertEquals("Work", task.getName());
        assertEquals("Complete task", task.getDescription());
    }

    @Test
    public void testInvalidTask(){

        assertThrows(IllegalArgumentException.class, () -> new Task("555555533333333", "Work", "Complete task"));

        assertThrows(IllegalArgumentException.class, () -> new Task(null, "Work", "Complete task"));

        assertThrows(IllegalArgumentException.class, () -> new Task("55533", "Workkkkkkkkkkkkkkkkkk", "Complete task"));

        assertThrows(IllegalArgumentException.class, () -> new Task("55533", null, "Complete task" ));

        assertThrows(IllegalArgumentException.class, () -> new Task("55533", "Work", "Text too long text too long text too long text too long text" ));

        assertThrows(IllegalArgumentException.class, () -> new Task("55533", "Work", null));
    }

    @Test
    public void testTaskUpdate(){
    	Task task = new Task("55533", "Work", "Complete task" );

        task.setName("Project");
        task.setDescription("Updated task");

        assertEquals("Project", task.getName());
        assertEquals("Updated task", task.getDescription() );
        assertEquals("55533", task.getTaskId());
    }
}