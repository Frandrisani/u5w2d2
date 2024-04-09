package francescoandrisani.u5w2d2.services;

import francescoandrisani.u5w2d2.entities.Author;
import francescoandrisani.u5w2d2.entities.BlogPost;
import francescoandrisani.u5w2d2.exceptions.NotFound;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class AuthorService {
    // ---------------------------------------------------

    // 1 - GET /authors => ritorna la lista di autori
    private List<Author> authorList = new ArrayList<>();
    public List<Author> getAuthors(){
        return this.authorList;
    }
    // ---------------------------------------------------

    // 2 - GET /authors/123 => ritorna un singolo autore
    public Author getAuthorById(int id){
        for (Author author : this.authorList){
            if (author.getId() == id){
                return author;
            }
        }throw new NotFound(id);
    }
    // ---------------------------------------------------

    // 3 - POST /authors => crea un nuovo autore
    public Author creaNuovoAuthor(Author body){
        Random random = new Random();
        body.setId(random.nextInt(1,100));
        body.setAvatar( "https://ui-avatars.com/api/?name="+ body.getName() + "+" + body.getSurname());
        this.authorList.add(body);
        return body;
    }


    // ---------------------------------------------------
}
