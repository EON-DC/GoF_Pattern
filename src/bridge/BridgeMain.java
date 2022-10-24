package bridge;

import adapter.Animal;
import adapter.Cat;
import adapter.Dog;
import adapter.TigerAdapter;

import java.util.ArrayList;

public class BridgeMain {
    public static void doGof(){
        System.out.println("==== BridgeMain.doGof start ====");
        String title = "복원된 지구";
        String author = "김형준";
        String[] content = {
                "플라스틱 사용의 감소와",
                "바다 생물 어획량 감소로 인하여",
                "지구는 복원되었다."
        };
        Draft draft = new Draft(title, author, content);
        Display display1 = new SimpleDisplay();
        draft.print(display1);

        System.out.println(); // 여백

        Display display2 = new CaptionDisplay();
        draft.print(display2);

        String publisher = "북악출판";
        int cost = 100;
        System.out.println("++++++++++++++"); // 여백
        Publication publication = new Publication(title, author, content, publisher, cost);
        publication.print(display1);
        System.out.println("++++++++++++++"); // 여백
        publication.print(display2);
        System.out.println("++++++++++++++"); // 여백
        System.out.println("==== BridgeMain.doGof end ====");
    }
}
