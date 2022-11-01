package kodlama.io.kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.kodlama.io.Devs.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService {

	private LanguageRepository languageRepository;

	@Autowired
	public LanguageManager(LanguageRepository languageRepository) {
		// super();
		this.languageRepository = languageRepository;
	}

	@Override
	public List<Language> getAll() {
		return languageRepository.getAll();
	}

	@Override
	public void add(Language language) throws Exception {
		// TODO Auto-generated method stub
		if (isIdExists(language.getId()))
			throw new Exception("id hazır");
		if (isNameExists(language.getName()))
			throw new Exception("adı hazır");
		languageRepository.add(language);
	}

	@Override
	public Language getById(int id) throws Exception {
		// TODO Auto-generated method stub
		if (!isIdExists(id))
            throw new Exception("id not found");
		return languageRepository.getById(id);
	}

	@Override
	public void update(int id, Language language) throws Exception {
		// TODO Auto-generated method stub
		 if (!isIdExists(language.getId()))
	            throw new Exception("id not found");
	        if (isNameExists(language.getName()))
	            throw new Exception("name cannot be repeated");
	}

	@Override
	public void delete(int id) throws Exception {
		// TODO Auto-generated method stub
		if (!isIdExists(id))
			throw new Exception("id silindi");
		languageRepository.delete(id);
	}
	
	private boolean isNameExists(String name) {
        return languageRepository.getAll().stream().anyMatch(l -> l.getName() == name);
    }

    private boolean isIdExists(int id) {
        return languageRepository.getAll().stream().anyMatch(l -> l.getId() == id);
    }
    

}
