package com.group_one.todo_list.repositories;

import com.group_one.todo_list.models.Category;
import com.group_one.todo_list.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {

    List<Task> findByCategoryEquals(Category category);
    List<Task> findByUserIdEquals(long userId);
    List<Task> findByDueDateLessThanAndHouseholdIdEquals(LocalDate dueDate, long householdId);
    List<Task> findByHouseholdIdEquals(long householdId);


}
