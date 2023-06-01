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

    public void savePost(Total_Board tb) {
        boardRepository.save(tb);
    }

    public Total_Board seePost(Long id) {
        return boardRepository.find(id);
    }
}
