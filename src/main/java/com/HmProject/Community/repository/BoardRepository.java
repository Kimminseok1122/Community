package com.HmProject.Community.repository;

import com.HmProject.Community.domain.Total_Board;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class BoardRepository {

    private final EntityManager em;

    public void save(Total_Board tb) {
        if (tb != null) {
            em.persist(tb);
        }
    }

    public Total_Board find(Long id) {
        return em.find(Total_Board.class, id);
    }
}
