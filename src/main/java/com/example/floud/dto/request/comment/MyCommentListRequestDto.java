package com.example.floud.dto.request.comment;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class MyCommentListRequestDto {
    private LocalDateTime createdAt;
}
