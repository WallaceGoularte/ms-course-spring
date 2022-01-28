package com.coursespring.msworker.resources;

import com.coursespring.msworker.entities.Worker;
import com.coursespring.msworker.services.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "workers")
public class WorkerResource {

    @Autowired
    private WorkerService workerService;

    @GetMapping
    public ResponseEntity<List<Worker>> findAll(){

        return ResponseEntity.ok(workerService.findAll());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Optional<Worker>> findById(@PathVariable final Long id){
        return ResponseEntity.ok(workerService.findById(id));
    }

    @PostMapping
    public void save(final Worker worker){
        workerService.save(worker);
    }

}
