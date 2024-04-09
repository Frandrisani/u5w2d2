package francescoandrisani.u5w2d2.controllers;
import francescoandrisani.u5w2d2.entities.BlogPost;
import francescoandrisani.u5w2d2.services.BlogPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class BlogPostController {

    @Autowired
    private BlogPostService blogPostService;

    // GET - LISTA DEI POST
    @GetMapping
    private List<BlogPost> getAllBlogPosts() {
        return this.blogPostService.getBlogPosts();
    }

    // POST - INSERISCE UN NUOVO POST CON L'ID HENERATO AUTOMATICAMENTE TRAMITE IL SERVICE
    @PostMapping
    private BlogPost saveNewPost(@RequestBody BlogPost body){
        return this.blogPostService.addBlogPost(body);
    }
}
