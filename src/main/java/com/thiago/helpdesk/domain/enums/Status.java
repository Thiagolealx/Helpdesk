package com.thiago.helpdesk.domain.enums;

public enum Status {

	ABERTO(0, "ROLE_ABERTO"), ANDAMENTO(1, "ROLE_ANDAMENTO"), ENCERRADO(2,"ROLE_ENCERRADO");
	
	private Integer codigo;
	private String decricao;
	
	private Status(Integer codigo, String decricao) {
		this.codigo = codigo;
		this.decricao = decricao;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public String getDecricao() {
		return decricao;
	}
	
	private static Status toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		
		for (Status x : Status.values()) {
			if(cod.equals(x.getCodigo())){
				return x;
			}
		}
		
		throw new IllegalArgumentException("Status invalido");
	}
	
}
