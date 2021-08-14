package javastudy.codingtest;

/**
 * 비어있는 숫자 찾기
 *
 * nums 배열은 1부터 N 까지의 숫자로 이루어진 배열입니다. 하지만 중간 중간에 없는 순자가 있습니다. 비어 있는 갯수를 반환하는 메소드 check를 작성하세요.
 *
 * 입력 값
 * 배열의 구성 요소는 1보다 큰 '자연수'만 포함됩니다.
 * 배열의 구성 요소는 '중복 값이' 들어가지 않습니다 (유일한 자연수의 집합)
 * 최대 100개의 숫자가 들어갈 수 있습니다. (nums.length 가 최대 100)
 *
 * 입출력 예제
 * 예1) [1,5,3,2]
 * 최대값이 5 이므로 1,2,3,4,5가 존재해야 합니다. 하지만 4가 없으므로   1 을 반환해야 합니다.
 * 예2) [1,7]
 * 최대값이 7 이므로 1 ~ 7 까지 존재해야 합니다. 그래서 [2,3,4,5,6] 가 없으므로 5 를 반환해야 합니다.
 * 예3) [1,2]
 * 최대값이 2 이므로 1,2가 존재해야 하고, 둘 다 존재하므로 0 을 반환해야 합니다.
 */
public class Code3 {
    private static int check(int[] ints) {
        // 구현 할 위치
        int max = ints[0];
        for(int i = 1; i < ints.length; i++) {
            max = (ints[i] > max) ? ints[i] : max;
        }
        return max - ints.length;
    }

    public static void main(String[] args) {

        System.out.println(check(new int[]{1, 5, 3, 2}) == 1);  //[4]
        System.out.println(check(new int[]{1, 7}) == 5);  //[2,3,4,5,6]
        System.out.println(check(new int[]{1, 2}) == 0);  //[]
    }
}