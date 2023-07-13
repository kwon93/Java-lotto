package domain;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        SellingLotto numberMaker = new SellingLotto();
        int i = numberMaker.buyLotto();

        Lotto lotto = new Lotto(numbers);
        List<Integer> integers = lotto.LottoNumberMaker(i);
        for (Integer integer : integers) {
            System.out.print("["+integer+"] ");
        }

    }
}
