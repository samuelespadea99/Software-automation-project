package Pack_mod4_task;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class TaskServiceTest {

	@Test
    public void testTaskService() {

        TaskService taskService = new TaskService();
        Task task = new Task("55533", "Work", "Complete task");

        taskService.addTask(task);

        assertEquals(task, taskService.getTask("55533"));

        taskService.updateName("55533", "Project");
        taskService.updateDescription("55533", "Updated task");

        assertEquals("Project", taskService.getTask("55533").getName());
        assertEquals("Updated task", taskService.getTask("55533").getDescription());

        taskService.deleteTask("55533");

        assertNull(taskService.getTask("55533"));
    }

    @Test
    public void testDuplicateTaskId() {

        TaskService taskService = new TaskService();

        Task task = new Task("55533", "Work", "Complete task");
        Task task2 = new Task("55533", "Study", "Second task");

        taskService.addTask(task);

        assertThrows(IllegalArgumentException.class, () ->
            taskService.addTask(task2));
    }
}