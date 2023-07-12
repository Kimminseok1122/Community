package com.HmProject.Community;

import com.HmProject.Community.domain.Diary;
import com.HmProject.Community.domain.Review;
import com.HmProject.Community.domain.Total_Board;
import com.HmProject.Community.repository.BoardRepository;
import com.HmProject.Community.service.BoardService;
import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
@Rollback(value = false)
class JpaTest {

    @Autowired
    BoardService boardService;

    @Autowired
    BoardRepository boardRepository;

    @Autowired
    EntityManager em;

    @Test
    public void 글찾기() {

        Diary diary = new Diary();

        diary.setBoard_title("ㅋㅋ");
        diary.setDiary_series("김민석 일기장 시리즈");
        diary.setBoard_date("xx일");
        diary.setBoard_likes("좋댓구");


        Review review = new Review();

        review.setBoard_title("ㅎㅎ");
        review.setReview_point("리뷰포인트");
        review.setBoard_date("xx월");
        review.setBoard_likes("좋댓구해라");

        System.out.println("===============저장===============");

        boardService.savePost(diary);
        boardService.savePost(review);

        em.flush();
        em.clear();

        System.out.println("===============찾기===============");

        Diary diary1 = (Diary) boardService.seePost(1L);
        Review review1 = (Review) boardService.seePost(2L);

        System.out.println(diary1.getBoard_title());
        System.out.println(diary1.getDiary_series());
        System.out.println(diary1.getBoard_date());
        System.out.println(diary1.getBoard_likes());

        System.out.println("=====================================");

        System.out.println(review1.getBoard_title());
        System.out.println(review1.getReview_point());
        System.out.println(review1.getBoard_date());
        System.out.println(review1.getBoard_likes());


    }
}