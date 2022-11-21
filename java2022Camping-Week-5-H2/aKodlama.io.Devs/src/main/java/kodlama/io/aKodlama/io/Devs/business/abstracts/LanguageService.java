package kodlama.io.aKodlama.io.Devs.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.aKodlama.io.Devs.business.requests.language.CreateLanguageRequest;
import kodlama.io.aKodlama.io.Devs.business.requests.language.DeleteLanguageRequest;
import kodlama.io.aKodlama.io.Devs.business.requests.language.UpdateLanguageRequest;
import kodlama.io.aKodlama.io.Devs.business.responses.language.GetAllLanguageResponse;
import kodlama.io.aKodlama.io.Devs.business.responses.language.GetByIdLanguageResponse;

@Service
public interface LanguageService {
	
	void add(CreateLanguageRequest createLanguageRequest) throws Exception;
	
	void delete(DeleteLanguageRequest deleteLanguageRequest);
	
	void update(UpdateLanguageRequest updateLanguageRequest);
	
	List<GetAllLanguageResponse> getAll();
	
	GetByIdLanguageResponse getById(int id);
}
