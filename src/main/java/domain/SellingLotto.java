package domain;

import java.util.List;
import java.util.Scanner;

public class SellingLotto {
    private List<Integer> lottoNum;

    public int buyLotto(){
        System.out.println("구입 금액을 입력해주세요.");

        Scanner scanner = new Scanner(System.in);
        int lottoPriceInWon = scanner.nextInt();
        int countedLotto = countingLotto(lottoPriceInWon);

        System.out.println("로또 "+countedLotto+"개를 구매하셨습니다.");

        return countingLotto(lottoPriceInWon);

    }
    public int countingLotto(int lottoPriceInWon){

        return  lottoPriceInWon / 1000;

    }



}
