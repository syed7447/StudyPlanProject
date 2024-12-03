package in.rohit.co.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.rohit.co.entity.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
