package br.com.gt.gtCatalog.dto;

import br.com.gt.gtCatalog.entities.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class RoleDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String authority;

	
	public RoleDTO(Role role) {
		super();
		id = role.getId();
		authority = role.getAuthority();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}
	
}
