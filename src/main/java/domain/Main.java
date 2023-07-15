package domain;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        SellingLotto numberMaker = new SellingLotto();

        int i = numberMaker.buyLotto();
        numberMaker.setLottos(i);
        String matchNum = numberMaker.matchNum();
        numberMaker.matchNumToInt(matchNum);
        numberMaker.bonusMatchNum();






    }
}
