package com.tech.ssm.domain;

public class Squad {
	private String squad_id;
	private String squad_teachar;
	private String squad_name;

	public String getsquad_id() {
		return squad_id;
	}

	public void setsquad_id(String squad_id) {
		this.squad_id = squad_id;
	}

	public String getsquad_teachar() {
		return squad_teachar;
	}

	public void setsquad_teachar(String squad_teachar) {
		this.squad_teachar = squad_teachar;
	}

	public String getsquad_name() {
		return squad_name;
	}

	public void setsquad_name(String squad_name) {
		this.squad_name = squad_name;
	}

	@Override
	public String toString() {
		return "squad [squad_id=" + squad_id + ", squad_teachar=" + squad_teachar + ", squad_name=" + squad_name + "]";
	}

}
