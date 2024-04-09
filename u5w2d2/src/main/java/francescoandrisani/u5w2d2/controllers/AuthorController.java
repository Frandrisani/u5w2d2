package francescoandrisani.u5w2d2.controllers;

import francescoandrisani.u5w2d2.entities.Author;
import francescoandrisani.u5w2d2.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @GetMapping
    private List<Author> getAllAuthors(){
        return this.authorService.getAuthors();
    }

    @GetMapping("/{id}")
    private Author getAuthor(@PathVariable("id") int id){
        return this.authorService.getAuthorById(id);
    }

    @PostMapping
    private Author saveNewAuthor(@RequestBody Author body){
        return this.authorService.creaNuovoAuthor(body);
    }
}
