package org.example.task.service.repository;

import org.example.task.dto.Repository;
import reactor.core.publisher.Flux;

public interface RepositoryService {
    Flux<Repository> getRepositories(final String username);
}
