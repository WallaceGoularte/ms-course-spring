package com.coursespring.msworker.resources;

import com.coursespring.msworker.entities.Worker;
import com.coursespring.msworker.services.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "workers")
public class WorkerResource {

    @Autowired
    private WorkerService workerService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Worker>> findAll(){

        return ResponseEntity.ok(workerService.findAll());
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Optional<Worker>> findById(@PathVariable final Long id){
        return ResponseEntity.ok(workerService.findById(id));
    }

}
