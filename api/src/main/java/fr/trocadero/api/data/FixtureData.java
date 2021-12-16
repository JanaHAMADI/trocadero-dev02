package fr.trocadero.api.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.trocadero.api.beans.Article;
import fr.trocadero.api.repositories.ArticleRepository;
import ro.polak.springboot.datafixtures.DataFixture;
import ro.polak.springboot.datafixtures.DataFixtureSet;

@Component
public class FixtureData implements DataFixture{
	@Autowired
	private ArticleRepository articleRepo;

	@Override
	public DataFixtureSet getSet() {
		return DataFixtureSet.DICTIONARY;
	}

	@Override
	public boolean canBeLoaded() {
		return true;
	}

	@Override
	public void load() {
		articleRepo.save(new Article("Set de quatre chaises", 150));
		articleRepo.save(new Article("Poupée ancienne", 25));
		articleRepo.save(new Article("Chien en céramique", 5));
		articleRepo.save(new Article("Parrure pour lit double", 15));
		
	}
	
	
}
