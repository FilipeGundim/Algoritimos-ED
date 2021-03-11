package lista4;

public class Pessoa {
	private int id;
	private String name;
	private String rg;
	private String datenasc;
	private String tel;

	public Pessoa(int id, String name, String rg, String datenasc, String tel) {
		this.id = id;
		this.name = name;
		this.rg = rg;
		this.datenasc = datenasc;
		this.tel = tel;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getDatenasc() {
		return datenasc;
	}

	public void setDatenasc(String datenasc) {
		this.datenasc = datenasc;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
}
