package com.crud.tasks.mapper;

import com.crud.tasks.domain.Task;
import com.crud.tasks.domain.TaskDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TaskMapperTest {

    @Autowired
    TaskMapper mapper = new TaskMapper();
    @Test
    void testMapToTask() {
        //Given
        TaskDto taskDto = new TaskDto(1L, "Test task", "test content");
        //When
        Task task = mapper.mapToTask(taskDto);
        //Then
        assertEquals(1L,task.getId());
    }

    @Test
    void testMapToTaskDto() {
        //Given
        Task task = new Task(1L,"Test task", "test content");
        //When
        TaskDto taskDto = mapper.mapToTaskDto(task);
        //Then
        assertEquals("Test task", taskDto.getTitle());
    }

    @Test
    void testMapToTaskDtoList() {
        //Given
        List<Task> taskList = Arrays.asList(new Task(1L, "test task", "test content"));
        //When
        List<TaskDto> taskDtoList = mapper.mapToTaskDtoList(taskList);
        //Then
        assertEquals("test content", taskDtoList.get(0).getContent());
    }
}
