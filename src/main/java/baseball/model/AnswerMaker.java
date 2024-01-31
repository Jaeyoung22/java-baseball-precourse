package baseball.model;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.LinkedHashSet;
import java.util.Set;

import static baseball.model.Number.DIGIT_NUMBER_CONDITION;

public class AnswerMaker {

    private AnswerMaker() {
    }

    public static Number make() {
        Set<Integer> answerDigits = new LinkedHashSet<>();

        while (answerDigits.size() != DIGIT_NUMBER_CONDITION) {
            int digit = Randoms.pickNumberInRange(1, 9);
            answerDigits.add(digit);
        }

        StringBuilder stringBuilder = new StringBuilder();

        for (Integer integer : answerDigits) {
            stringBuilder.append(integer);
        }

        int answer = Integer.parseInt(stringBuilder.toString());

        return new Number(answer);
    }
}
