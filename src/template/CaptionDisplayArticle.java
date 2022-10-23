package template;

import java.util.ArrayList;

public class CaptionDisplayArticle extends DisplayArticleTemplate {
    public CaptionDisplayArticle(Article article) {
        super(article);
    }

    @Override
    protected void title() {
        System.out.println("TITLE : "+article.getTitle());
    }

    @Override
    protected void content() {
        System.out.println("CONTENT :");
        ArrayList<String> content = article.getContent();
        int cntLines = content.size();
        content.stream().iterator()
                .forEachRemaining(line -> System.out.println("      "+line));
    }

    @Override
    protected void footer() {
        System.out.println("FOOTER : " + article.getFooter());
    }
}
