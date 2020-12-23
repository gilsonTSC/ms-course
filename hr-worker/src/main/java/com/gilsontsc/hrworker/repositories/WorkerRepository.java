package com.gilsontsc.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gilsontsc.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}