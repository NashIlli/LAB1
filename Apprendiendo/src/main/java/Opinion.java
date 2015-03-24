/**
 * Created by Nash on 24/03/15.
 */
public class Opinion {
    private static int ID = 0;
    private int id;
    private int score;
    private String comment;

    public Opinion(int score, String comment) {
        this.score = score;
        this.comment = comment;
        id = ID;
        ID++;
    }
}
