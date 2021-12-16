package fr.trocadero.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.trocadero.api.beans.Article;
import fr.trocadero.api.services.ArticleService;

@RestController
public class ArticleController {
	@Autowired
	private ArticleService articleService;
	
	@GetMapping("/articles")
	@CrossOrigin(value = "*")
	public List<Article> getAllArticles() {
		return articleService.getAllArticles();
	}
}
