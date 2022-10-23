package template;

import java.util.ArrayList;

public class SimpleDisplayArticle extends DisplayArticleTemplate{

    public SimpleDisplayArticle(Article article) {
        super(article);
    }

    @Override
    protected void title() {
        System.out.println(article.getTitle());
    }

    @Override
    protected void content() {
        ArrayList<String> content = article.getContent();
        int cntLines = content.size();
        content.stream().iterator()
                .forEachRemaining(line -> System.out.println(line));
    }

    @Override
    protected void footer() {
        System.out.println(article.getFooter());

    }
}
