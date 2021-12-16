package fr.trocadero.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.trocadero.api.beans.Article;
import fr.trocadero.api.repositories.ArticleRepository;

@Service
public class ArticleService {
	@Autowired
	private ArticleRepository articleRepo;
	
	public void saveArticle(Article article) {
		articleRepo.save(article);
	}
	
	public List<Article> getAllArticles() {
		return articleRepo.findAll();
	}
	
	public void updateArticle(Article article) {
		articleRepo.save(article);
	}
	
	public void deleteArticle(long id) {
		articleRepo.deleteById(id);
	}

}
