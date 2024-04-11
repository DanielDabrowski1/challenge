package org.example.task.controller.repository.mapper;

import org.example.task.controller.repository.response.RepositoryResponse;
import org.example.task.dto.Repository;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RepositoryMapper {

    RepositoryResponse repositoryToRepositoryResponse(Repository repository);
}
