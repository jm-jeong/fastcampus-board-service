package com.fastcampus.boardservice.repository;

import com.fastcampus.boardservice.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
