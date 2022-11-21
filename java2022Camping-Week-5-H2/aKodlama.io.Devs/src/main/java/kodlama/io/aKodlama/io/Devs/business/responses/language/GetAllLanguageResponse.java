package kodlama.io.aKodlama.io.Devs.business.responses.language;

import java.util.List;

import kodlama.io.aKodlama.io.Devs.entities.concretes.Technology;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllLanguageResponse {
	private int id;
	private String name;
	private List<Technology> technologies;
}
