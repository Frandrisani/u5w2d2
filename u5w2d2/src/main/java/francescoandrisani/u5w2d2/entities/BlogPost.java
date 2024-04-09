package francescoandrisani.u5w2d2.entities;


import lombok.*;

import java.time.LocalTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class BlogPost {
    private int id;
    private String category;
    private String title;
    private String content;
    private LocalTime timeForLecture;
    private String cover;

    public BlogPost(int id, String category, String title, String content, LocalTime timeForLecture, String cover) {
        this.id = id;
        this.category = category;
        this.title = title;
        this.content = content;
        this.timeForLecture = timeForLecture;
        this.cover = "https://picsum.photos/200/300";
    }

}
