package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 로또 한장을 의미하는 객체
 */
public class Lotto {
    private List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    // 추가 기능 구현

}
