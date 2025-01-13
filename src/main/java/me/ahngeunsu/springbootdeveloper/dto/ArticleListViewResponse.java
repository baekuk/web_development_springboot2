package me.ahngeunsu.springbootdeveloper.dto;

import lombok.Getter;
import me.ahngeunsu.springbootdeveloper.domain.Article;

import java.time.LocalDateTime;

@Getter
public class ArticleListViewResponse {
    private final Long id;
    private final String title;
    private final String content;
    private LocalDateTime createdAt;

    public ArticleListViewResponse(Article article) {
        this.id = article.getId();
        this.title = article.getTitle();
        this.content = article.getContent();
        this.createdAt = article.getCreatedAt();
    }
    /*
        다 작성한분들 controller 패키지에
        BlogViewController 파일 만들겠습니다.
     */
}
