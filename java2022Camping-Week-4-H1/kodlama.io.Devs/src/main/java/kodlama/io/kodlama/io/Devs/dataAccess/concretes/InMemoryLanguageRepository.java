package kodlama.io.kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.kodlama.io.Devs.entities.concretes.Language;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository{

	List<Language> languages;
	
	public InMemoryLanguageRepository() {
		languages = new ArrayList<Language>();
		languages.add(new Language(0, "C#"));
		languages.add(new Language(1, "Java"));
		languages.add(new Language(2, "Python"));
	}

	@Override
	public List<Language> getAll() {
		
		return languages;
	}

	@Override
	public void add(Language language) {
		// TODO Auto-generated method stub
		languages.add(language);
	}

	@Override
	public void update(int id, Language language) {
		// TODO Auto-generated method stub
		Language existingLanguage = languages.stream().filter(l -> l.getId() == id).findFirst().orElseThrow();
		existingLanguage.setName(language.getName());
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		languages.removeIf(l -> l.getId() == id); 
		
	}

	@Override
	public Language getById(int id) {
		// TODO Auto-generated method stub
		
		return languages.stream().filter(l -> l.getId() == id).findFirst().orElseThrow();
	}

}
