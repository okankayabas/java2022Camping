package kodlama.io.aKodlama.io.Devs.business.requests.technology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateTechnologyRequest {
	private int id;
	private String name;
	private int languageId;
}