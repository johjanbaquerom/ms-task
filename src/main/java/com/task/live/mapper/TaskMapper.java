package com.task.live.mapper;

import com.task.live.dto.TaskDto;
import com.task.live.entity.Task;
import org.mapstruct.Mapper;

@Mapper(componentModel = "String")
public interface TaskMapper {

    TaskDto taskToTaskDto(Task task);
    Task taskDtoToTask(TaskDto taskDto);
}
