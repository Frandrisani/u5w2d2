package francescoandrisani.u5w2d2.services;

import francescoandrisani.u5w2d2.entities.BlogPost;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class BlogPostService {
    // ---------------------------------------------------
    // 1 - GET /blogPosts => ritorna la lista di blog post
    private List<BlogPost> postList = new ArrayList<>();
    public List<BlogPost> getBlogPosts() {
        return this.postList;
    }
    // ---------------------------------------------------

    // 2 - GET /blogPosts/id => ritorna il blog post con id specificato


    // ---------------------------------------------------

    // 3 - POST /blogPosts => inserisce un nuovo blog post
    public BlogPost addBlogPost(BlogPost body) {
        Random random = new Random();
        body.setId(random.nextInt(1,100));
        this.postList.add(body);
        return body;
    }
    // ---------------------------------------------------



}
