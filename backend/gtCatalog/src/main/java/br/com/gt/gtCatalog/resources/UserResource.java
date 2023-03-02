package br.com.gt.gtCatalog.resources;

import br.com.gt.gtCatalog.dto.UserDTO;
import br.com.gt.gtCatalog.dto.UserInsertDTO;
import br.com.gt.gtCatalog.dto.UserUpdateDTO;
import br.com.gt.gtCatalog.services.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@Autowired
	private UserService service;
	
	@GetMapping
	public ResponseEntity<Page<UserDTO>> findAll(
			@RequestParam(value = "page", defaultValue = "0") Integer page,
			@RequestParam(value = "linesPerPage", defaultValue = "12") Integer linesPerPage,
			@RequestParam(value = "orderBy", defaultValue = "firstName") String orderBy,
			@RequestParam(value = "direction", defaultValue = "ASC") String direction,
			@RequestParam(value = "name", defaultValue = "") String name
			)
	{
		
		PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction), orderBy);
		
		Page<UserDTO> list = service.findAllPaged(name,pageRequest);
		
		return ResponseEntity.ok().body(list);
		
	}
	
	@GetMapping(value= "/{id}")
	public ResponseEntity<UserDTO> findById(@PathVariable Long id){
		UserDTO dto = service.findById(id);
		return ResponseEntity.ok().body(dto);
		
	}
	
	@PostMapping
	public ResponseEntity<UserDTO> insert(@Valid @RequestBody UserInsertDTO dto){
		UserDTO newDTO = service.insert(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(newDTO.getId()).toUri();
		
		return ResponseEntity.created(uri).body(newDTO);
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<UserDTO> update(@PathVariable Long id,@Valid @RequestBody UserUpdateDTO dto){
		
		UserDTO newDto = service.update(id, dto);
		return ResponseEntity.ok().body(newDto);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<UserDTO> delete(@PathVariable Long id){
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
}