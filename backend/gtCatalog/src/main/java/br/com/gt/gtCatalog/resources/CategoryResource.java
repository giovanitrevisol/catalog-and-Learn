package br.com.gt.gtCatalog.resources;

import br.com.gt.gtCatalog.entities.Category;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

    @GetMapping
    public ResponseEntity<List<Category>> findAll(){
        List<Category> list = new ArrayList<>();
        list.add(Category.builder().id(1l).name("Books").build());
        list.add(Category.builder().id(1l).name("Electronics").build());

        return ResponseEntity.ok().body(list);
    }

}
