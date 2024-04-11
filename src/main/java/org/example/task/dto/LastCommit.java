package org.example.task.dto;

import lombok.Builder;

@Builder
public record LastCommit(String sha) { }
