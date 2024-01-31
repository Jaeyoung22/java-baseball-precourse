package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Matching {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("영택");
        names.add("영로");
        names.add("지우");
        names.add("주현");
        names.add("준혁");
        names.add("영우");
        names.add("현정");


        List<String> shuffled;
        while (true) {
            shuffled = Randoms.shuffle(names);
            boolean allMatched = true;

            for (int i = 0; i < shuffled.size(); i++) {
                if (names.get(i).equals(shuffled.get(i))) {
                    allMatched = false;
                    break;
                }
            }

            if (allMatched) {
                break;
            }
        }

        for (int i = 0; i < shuffled.size(); i++) {
            System.out.println("리뷰어 : " + names.get(i) + " - " + "리뷰이 : " + shuffled.get(i));
        }
    }
}
