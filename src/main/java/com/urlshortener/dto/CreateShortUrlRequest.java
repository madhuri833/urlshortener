package com.urlshortener.dto;
import jakarta.validation.constraints.*;
public record CreateShortUrlRequest(
    @NotBlank @Size(max=2048) String url,
    @Pattern(regexp="^[a-zA-Z0-9_\\-]{3,16}$") String customAlias,
    Long ttlSeconds) {}
