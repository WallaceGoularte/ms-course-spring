package com.coursespring.msworker.services;

import com.coursespring.msworker.entities.Worker;
import com.coursespring.msworker.repositories.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkerService {

    @Autowired
    private WorkerRepository workerRepository;

    public List<Worker> findAll() {
        return this.workerRepository.findAll();
    }

    public Optional<Worker> findById(final Long id) {
        return Optional.of(workerRepository.findById(id).orElseThrow());
    }

    public void save(final Worker worker) {
        this.workerRepository.save(worker);
    }

    public void saveAll(final List<Worker> workers) {
        this.workerRepository.saveAll(workers);
    }

    public void delete(final Worker worker) {
        this.workerRepository.delete(worker);
    }
}
