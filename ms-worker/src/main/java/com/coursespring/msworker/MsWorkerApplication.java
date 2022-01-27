package com.coursespring.msworker;

import com.coursespring.msworker.entities.Worker;
import com.coursespring.msworker.repositories.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class MsWorkerApplication implements CommandLineRunner {

    @Autowired
    private WorkerRepository workerRepository;

    public static void main(String[] args) {
        SpringApplication.run(MsWorkerApplication.class, args);
    }

    @Override
    public void run(final String... args) throws Exception {
        final Worker worker1 = new Worker(null, "Wallace", 400.0);

        final Worker worker2 = new Worker(null, "Joana", 600d);

        final Worker worker3 = new Worker(null, "Beatris", 800d);

        this.workerRepository.saveAll(Arrays.asList(worker1, worker2, worker3));
    }
}
