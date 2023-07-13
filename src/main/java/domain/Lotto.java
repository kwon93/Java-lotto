package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 로또 한장을 의미하는 객체
 */
public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        this.numbers = numbers;
    }


    public List<Integer> LottoNumberMaker(int countingLotto){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < countingLotto; i++){ //로또를 구매한만큼 번호 제조에 들어간다.
            for (int j = 0; j < 45 ; j++) {
                list.add(j);
            }
            Collections.shuffle(list);
        }
        numbers = list.subList(0, 6);
        return numbers;
    }

    // 추가 기능 구현

}
