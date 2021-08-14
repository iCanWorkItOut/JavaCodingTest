package javastudy.codingtest;
/**
 * 숫자 쌍 찾기
 * 하나의 배열에 0보다 큰 여러가지 수가 있습니다.
 * 이때 임의의 숫자를 K 라고 할 경우 -K(음수값, 1 이면 -1)인 경우의 값이 배열 내에 있다면 K를 출력하는 메소드를 작성하세요.
 * K 와 -K 한 쌍을 찾을수 없다면 0을 출력하고 쌍이 여러개 있을 경우 K가 큰 값을 출력하세요.
 *
 * 입출력 예제
 * 1. A = [3, 2, -2, 5, -3] 인 경우 결과는 3 (3 과 -3 이 배열 내에 있음)
 * 2. A = [1, 1, 2, -1, 2, -1] 인 경우 결과는 1 (1과 -1이 배열 내에 있음)
 * 3. A = [1, 2, 3, -4] 인 경우 결과는 0 (쌍이 이루어 질수 없음)
 *
 * public int solution(int[] A){
 *   // 코드 작성
 * }
 */
public class FindNumericPair {
    private static int solution(int[] A) {

        int result = 0;
        for(int i = 0; i < A.length-1; i++) {
            if(A[i] < 1) continue;
            for(int j = i+1; j < A.length; j++) {
                if(A[i] == A[j] * -1) {
                    result = (A[i] > result) ? A[i] : result;
                    break;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 2, -2, 5, -3}));
        System.out.println(solution(new int[]{1, 1, 2, -1, 2, -1}));
        System.out.println(solution(new int[]{1, 2, 3, -4}));
    }
}
