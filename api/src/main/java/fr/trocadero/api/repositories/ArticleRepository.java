package fr.trocadero.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.trocadero.api.beans.Article;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {

}
