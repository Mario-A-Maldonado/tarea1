package com.tarea1.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;


@NoRepositoryBean
public interface IRepo<T,ID> extends JpaRepository<T, ID>{
	

}
