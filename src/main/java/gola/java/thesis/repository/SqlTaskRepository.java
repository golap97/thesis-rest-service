package gola.java.thesis.repository;

import gola.java.thesis.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository/*(path = "todos", collectionResourceRel = "todos")*/
interface SqlTaskRepository extends TaskRepository, JpaRepository<Task, Integer> {

/*    @Override
    @RestResource(exported = false)
    void deleteById(Integer integer);

    @Override
    @RestResource(exported = false)
    void delete(Task task);*/

}
