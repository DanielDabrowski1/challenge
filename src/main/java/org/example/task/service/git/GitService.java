package org.example.task.service.git;

import org.example.task.dto.Branch;
import org.example.task.dto.LastCommit;
import org.example.task.dto.Repository;
import reactor.core.publisher.Flux;

public interface GitService {

    Flux<Repository> getRepositories(final String username);

    Flux<Branch> getBranches(final String username, final String repositoryName);

    Flux<LastCommit> getLastCommit(final String username, final String repositoryName, String branchName);
}
