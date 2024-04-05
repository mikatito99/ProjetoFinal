package br.com.Vainaweb.escolat1.model;


import br.com.Vainaweb.escolat1.enums.Cargo;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Colaborador {



    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @SuppressWarnings("unused")
	private String nome;

    @Column(unique = true)
    private String email;

    @Column(unique = true)
    private String cpf;

    @Embedded
    private Cargo cargo;

    @Embedded
    private Endereco endereco;

   

    public Colaborador(String nome, String cpf, String email, Cargo cargo, Endereco endereco) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.cargo = cargo;
        this.endereco = endereco;
    }




   




	public Object getEmail() {
	
		return null;
	}





	public Object getNome() {
		
		return null;
	}





	public void setNome(Object nome2) {
		
		
	}





	public void setEmail(Object email2) {
		
		
	}



	public void setNome(String nome) {
		this.nome = nome;
	}
   

}