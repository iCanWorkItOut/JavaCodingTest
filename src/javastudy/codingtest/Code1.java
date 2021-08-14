package javastudy.codingtest;
/**
 *  문자열 판독 하기
 *
 * 동일한 길이의 A와 B   2개의 문자열이 주어집니다.
 * A 를 이루고 있는 문자를  x칸 왼쪽 또는 오른쪽으로 움직였을때 B와 동일한지 체크하는 메소드 solve(String a, String b)를 작성하세요.
 *
 * 입력 값
 * A와 B는   null 이거나 empty 하지 않으며 무조건 '소문자'로 동일한 length 를 가집니다.
 * A와 B는 min length 1 , max length 10 입니다.
 * '소문자'만 고민하시면 됩니다
 *
 * 입출력 예제
 * 예1) A = "abc", B = "bca"
 * abc 에서 오른쪽으로 한칸씩 움직이려고 하면 c 가 마지막에 있으므로 제일 처음으로 옵니다. 그래서 cab가 됩니다.
 * cab 인 상태에서 다시 한칸씩 움직이면  b가 마지막에 있으므로 제일 앞 칸으로 오기 때문에 bca가 됩니다.
 * A="abc"는 2번 오른쪽으로 움직여서 B와 동일한 bca가 되기 때문에 true를 반환합니다.
 * 예2) A = "abcde", B="abced"
 * abcde는 오른쪽이나 왼쪽 아무리 움직여도 "abced"와 동일한 값을 만들 수 없기 떄문에 false를 반환합니다.
 * 예3) A="abcd", B="abcd"
 * A를 4칸 움직이거나,  안 움직여도 A = B = "abcd" 이기 때문에 true 를 반환합니다.
 */
public class Code1 {
    private static boolean solve(String a, String b) {
        // 구현 할 위치
        // 입력된 문자열이 일치하면 true
        if(a == b) { return true; }
        // 입력된 문자열이 다르지만 길이가 1이라면 false
        else if(a.length() == 1) { return false;}

        String s = a;
        char[] arr = new char[s.length()];
        for(int i = 0; i < s.length()-1; i++) {
            for (int j = 0; j < s.length(); j++) {
                if (j == s.length() - 1) {
                    arr[j] = s.charAt(0);
                } else {
                    arr[j] = s.charAt(j + 1);
                }
            }
            s = new String(arr);
            if (s.equals(b)) { return true; }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(solve("abc", "bca") == true);
        System.out.println(solve("abcd", "abcd" ) == true );
        System.out.println(solve("abcde", "abced" ) == false );
    }
}
