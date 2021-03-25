package entities;

public class Pacotes {
	
	private String light = "Light - Acesso em horario reduzido: 9h-16h.";
	private String full = "Full - Acesso sem restrição.";
	private String top = "Top - Acesso sem restrição + acompanhamento.";
	
	public Pacotes() {
			}
	
	public Pacotes(String light, String full, String top) {
		
		this.light = light;
		this.full = full;
		this.top = top;
	}

	public String getLight() {
		return light;
	}


	public String getFull() {
		return full;
	}


	public String getTop() {
		return top;
	}

	
}
