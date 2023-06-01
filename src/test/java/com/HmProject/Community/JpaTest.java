package com.HmProject.Community;

import com.HmProject.Community.domain.Diary;
import com.HmProject.Community.domain.Review;
import com.HmProject.Community.repository.BoardRepository;
import com.HmProject.Community.service.BoardService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class JpaTest {

    @Autowired
    BoardService boardService;

    @Autowired
    BoardRepository boardRepository;

    @Test
    @Rollback(value = false)
    public void 글작성() {

        Diary diary = new Diary();

        diary.setDiary_content("ㅋㅋ");
        diary.setDiary_date("예시야");
        diary.setDiary_views("몇번 봤겠지");

        Review review = new Review();

        review.setReview_content("아오 페리시치");
        review.setReview_date("손흥민 굿");
        review.setReview_views("야스 ");

        boardService.savePost(diary);
        boardService.savePost(review);

    }
}