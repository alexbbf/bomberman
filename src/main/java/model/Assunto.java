package model;


public enum Assunto {
	
	APH("APH","Atendimento pr�-hospitalar"),COMBATE_INCENDIO("CI","Combate a Inc�ndio"),SALV_TER("S.T.","Salvamento Terrestre");
	
	private String label;
	
	private String descricao;

	private Assunto(String label, String descricao) {
		this.label = label;
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public String getLabel() {
		return label;
	}
	
	

}
