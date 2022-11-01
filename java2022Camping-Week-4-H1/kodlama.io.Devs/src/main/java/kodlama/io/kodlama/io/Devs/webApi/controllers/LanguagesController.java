package kodlama.io.kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.kodlama.io.Devs.entities.concretes.Language;

@RestController //annotation
@RequestMapping("/api/languages")
public class LanguagesController {
	private LanguageService languageService;
	
	@Autowired
	public LanguagesController(LanguageService languageService) {
		//super();
		this.languageService = languageService;
	}
	@GetMapping("/getall")
	public List<Language> getAll(){
		return languageService.getAll();
	}
	@GetMapping("/{id}")
	public Language getById(@PathVariable(name = "id") int id) throws Exception {
		return languageService.getById(id);
	}
	@PostMapping
	public String add(@RequestBody Language language)throws Exception{
		languageService.add(language);
		return ("eklendi");
		
	}
	@DeleteMapping("/{id}")
	public String delete(@PathVariable int id )throws Exception{
	//	languageService.delete(id);4 buradan devam
		languageService.delete(id);
		return("silindi");
	}
	@PutMapping("/{id}")
	public void updateById(@PathVariable int id, @RequestBody Language language) throws Exception{
		languageService.update(id, language);
	}
}
