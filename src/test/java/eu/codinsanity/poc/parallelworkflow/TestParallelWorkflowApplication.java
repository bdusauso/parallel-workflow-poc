package eu.codinsanity.poc.parallelworkflow;

import org.springframework.boot.SpringApplication;

public class TestParallelWorkflowApplication {

    public static void main(String[] args) {
        SpringApplication.from(ParallelWorkflowApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
