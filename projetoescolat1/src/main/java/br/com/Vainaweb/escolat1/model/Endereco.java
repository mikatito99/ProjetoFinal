package br.com.Vainaweb.escolat1.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Endereco {
    

	
	
	    private String rua;
	    private String cidade;
	    private String estado;
	    private String cep;
		public String getRua() {
			return rua;
		}
		public void setRua(String rua) {
			this.rua = rua;
		}
		public String getCidade() {
			return cidade;
		}
		public void setCidade(String cidade) {
			this.cidade = cidade;
		}
		public String getEstado() {
			return estado;
		}
		public void setEstado(String estado) {
			this.estado = estado;
		}
		public String getCep() {
			return cep;
		}
		public void setCep(String cep) {
			this.cep = cep;
		}
}
