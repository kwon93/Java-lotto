package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SellingLotto {
    private List<Lotto> lottos = new ArrayList<>();
    private List<Integer> matchNums = new ArrayList<>(6);

    //유저에게 구입할 로또의 개수를 처리하는 메서드
    public int buyLotto(){
        System.out.println("구입 금액을 입력해주세요.");

        Scanner scanner = new Scanner(System.in);
        int lottoPriceInWon = scanner.nextInt();
        int countedLotto = countingLotto(lottoPriceInWon);

        System.out.println("로또 "+countedLotto+"개를 구매하셨습니다.");

        return countingLotto(lottoPriceInWon);

    }
    //유저가 구입한 로또의 금액만큼 로또의 개수로 변환해주는 메서드
    public int countingLotto(int lottoPriceInWon){
        return  lottoPriceInWon / 1000;
    }

    //로또를 생성하는 기능만 수행하는 메서드
    public List<Integer> lottoNumberMaker(){
        ArrayList<Integer> list = new ArrayList<>();
        for (int j = 1; j <= 45 ; j++) {
            list.add(j);
        }
        Collections.shuffle(list);
        List<Integer> lottosNum = list.subList(0, 6);
        new Lotto(lottosNum);
        return lottosNum;
    }

    //로또 객체를 생성하는 메서드


    //번호를 출력하는 기능만 수행하는 메서드
    public void setLottos(int countingLotto){
        for (int i = 0; i < countingLotto;  i++) {
            List<Integer> integers = lottoNumberMaker();
            Lotto lotto = new Lotto(integers);
            System.out.print("[");
            for (Integer integer : integers) {
                System.out.print(integer+",");
            }
            System.out.print("]");
            System.out.println();
            lotto.getNumbers();
        }
    }

    //당첨번호 입력을 담당하는 메서드
    public String matchNum(){
        System.out.println("당첨번호를 입력해주세요.");
        System.out.println("번호 입력 후 , 쉼표를 입력해주세요.");
        Scanner scanner = new Scanner(System.in);
        String matchNums = scanner.nextLine();
        if (matchNums.length() > 18){
            System.out.println("입력 방식이 잘못되었습니다. 다시 입력해주세요.");
            matchNum();
        }
        return matchNums;
    }

    //String으로 들어온 당첨번호를 List<Integer> 로 변환하는 메서드
    public List<Integer> matchNumToInt(String matchNum){
        List<Integer> integers = new ArrayList<>(6);
        String repl = matchNum.replace(",","");
        for (int i = 0; i < matchNum.length() ; i++) {
                integers.add(matchNum.charAt(i) - '0');
        }
        return integers;
    }

    //보너스 번호를 입력받는 메서드
    public int bonusMatchNum(){
        System.out.println("보너스 번호를 입력해주세요.");
        Scanner scanner = new Scanner(System.in);
        int bonusNum = scanner.nextInt();

        return bonusNum;

    }



}
