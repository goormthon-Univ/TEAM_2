package com.example.floud.dto.request.memoir;


import com.example.floud.entity.Hashtag;
import com.example.floud.entity.Memoir;
import com.example.floud.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class MemoirCreateRequestDto {
    private Long user_id;
    private String title;
    private String place;
    private String memoirKeep;
    private String memoirProblem;
    private String memoirTry;
    private List<String> hashtag;



    public Memoir toMemoir(User user) {
        return Memoir.builder()
                .title(title)
                .place(place)
                .memoirKeep(memoirKeep)
                .memoirProblem(memoirProblem)
                .memoirTry(memoirTry)
                .user(user)
                .build();
    }


}
