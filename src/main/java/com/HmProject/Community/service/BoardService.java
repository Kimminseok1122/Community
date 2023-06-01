package com.HmProject.Community.service;

import com.HmProject.Community.domain.Total_Board;
import com.HmProject.Community.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;

    @Transactional
    public void savePost(Total_Board tb) {
        boardRepository.save(tb);
    }
}
