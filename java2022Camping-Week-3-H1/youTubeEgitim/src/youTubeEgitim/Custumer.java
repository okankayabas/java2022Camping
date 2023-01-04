package youTubeEgitim;

public class Custumer {
	public Custumer() {
		System.out.println("Müşteri nesnesi başlatıldı");
	}	
	public int id;	
	public String City;
		
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}	
}
