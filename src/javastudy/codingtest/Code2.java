package javastudy.codingtest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *  비밀번호 형식 검사
 *
 * 이번에 회원 관리 프로그램을 만들면서 고객에게 ID 와 '비밀번호'를 입력받아야 하는 기능을 개발해야 합니다.
 * 그 중 '비밀번호'를 입력받을 때 다음과 같은 제약을 주고자 합니다.
 *
 * 최소한 5자리 이상의 길이를 가져야 한다.
 * 최소한 1개 이상의 숫자가 포함되어야 한다.
 * 최소한 1개 이상의 대문자가 포함되어야 한다.
 *
 * 이 조건을 만족는 true 를 반환하는 checkPassword(String password)를 작성해주세요.
 *
 * 입력 값
 * length 1 이상의 문자열이 들어 올 수 있습니다.
 *
 * 입출력 예제
 * 예1)  password = '8eqq'
 * 4자리 이므로 false 를 반환합니다.
 * 예2) password = 'password1'
 * 대문자가 없으므로 false 를 반환합니다.
 * 예3) password = "Password1"
 * 3가지 요구사항에 충족하므로 true 를 반환합니다.
 */
public class Code2 {

    private static boolean checkPassword(String s) {
        // 구현 할 위치
        return Pattern.matches("(?=.*[A-Z])(?=.*[0-9]).{5,}",s);
    }

    public static void main(String[] args) {
        System.out.println(checkPassword("8eqq") == false);
        System.out.println(checkPassword("password1") == false);
        System.out.println(checkPassword("Password1") == true);
    }

}
