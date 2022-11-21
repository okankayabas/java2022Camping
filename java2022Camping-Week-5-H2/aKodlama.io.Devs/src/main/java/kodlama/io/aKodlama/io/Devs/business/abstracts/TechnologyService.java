package kodlama.io.aKodlama.io.Devs.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.aKodlama.io.Devs.business.requests.technology.CreateTechnologyRequest;
import kodlama.io.aKodlama.io.Devs.business.requests.technology.DeleteTechnologyRequest;
import kodlama.io.aKodlama.io.Devs.business.requests.technology.UpdateTechnologyRequest;
import kodlama.io.aKodlama.io.Devs.business.responses.technology.GetAllTechnologyResponse;
import kodlama.io.aKodlama.io.Devs.business.responses.technology.GetByIdTechnologyResponse;

@Service
public interface TechnologyService {
	void add(CreateTechnologyRequest createTechnologyRequest) throws Exception;
	
	void delete(DeleteTechnologyRequest deleteTechnologyRequest);
	
	void update(UpdateTechnologyRequest updateTechnologyRequest);
	
	List<GetAllTechnologyResponse> getAll();
	
	GetByIdTechnologyResponse getById(int id);
}
