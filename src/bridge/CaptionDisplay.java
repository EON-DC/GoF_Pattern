package bridge;

public class CaptionDisplay implements Display{
    @Override
    public void title(Draft draft) {
        System.out.println("[Case CaptionDisplay]");
        System.out.println("제목 : " + draft.getTitle());
    }

    @Override
    public void author(Draft draft) {
        System.out.println("저자 : " + draft.getAuthor());

    }

    @Override
    public void content(Draft draft) {
        System.out.println("내용 : ");
        String[] contents = draft.getContent();
        for (int i = 0; i < contents.length; i++) {
            System.out.println("      "+contents[i]);
        }
    }
}
