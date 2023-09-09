package com.test;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Integer>{
	
}
//public interface TaskRepository extends JpaRepository<Task, Integer> {
//    
//}
