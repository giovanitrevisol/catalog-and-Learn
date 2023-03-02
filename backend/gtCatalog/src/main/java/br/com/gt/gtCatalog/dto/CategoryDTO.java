package br.com.gt.gtCatalog.dto;

import br.com.gt.gtCatalog.entities.Category;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CategoryDTO implements Serializable {

	private Long id;
	private String name;


}
