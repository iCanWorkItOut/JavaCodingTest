package javastudy.codingtest;

import java.util.Arrays;

/**
 * 버그 찾기
 * 두개의 정수 배열이 주어진다. 배열의 크기는 둘다 같을수도 다를수도 있다. 최소 크기는 1이다.
 * 이때 두 정수 배열중 공통으로 가장 작은 숫자를 출력하는 로직을 수정하라
 * 만약 공통되는 숫자가 없을 경우 -1 을 출력하도록 한다.
 *
 * 이미 잘 돌아가는 코드에 어딘가 버그가 있다. 이를 찾아서 수정을 해야 한다.
 * 단, 수정은 최대 두줄까지만 허용 가능하다. (수정/추가/삭제 모두 포함 두줄제한)
 * 한줄에 ‘;’을 이용해서 여러 로직 넣는 행위 금지. (예 : int a=1;a+=1;a--; )
 *
 * 입력 예시 1 :
 * A = {1, 3, 2, 1}
 * B = {4, 2, 5, 3, 2}
 *
 * 출력 1 :
 * 2
 *
 * 입력예시 2 :
 * A = {2, 1}
 * B = {3, 3}
 *
 * 출력 2 :
 * -1
 *
 * import java.util.*;
 *
 * class Solution {
 * 	int solution(int[] A, int[] B){
 * 		int n = A.length;
 * 		int m = B.length;
 * 		Arrays.sort(A);
 * 		Arrays.sort(B);
 *
 * 		int i=0;
 * 		for ( int k=0 ; k < n ; k++) {
 * 			if (i < m - 1 && B[i] < A[k]) {
 * 				i += 1;
 *                        }
 * 			if (A[k] == B[i]) {
 * 				return A[k];
 *            }* 		}
 * 		return -1;
 * 	}
 * }
 */
public class FindBug {
    private static int solution(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;
        Arrays.sort(A);
        Arrays.sort(B);

        int i=0;
        for ( int k=0 ; k < n ; k++) {
            while (i < m-1 && B[i] < A[k]) {
                i += 1;
            }
            if (A[k] == B[i]) {
                return A[k];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2 ,3}, new int[]{2, 3, 4, 5}));
        System.out.println(solution(new int[]{1, 2 ,3}, new int[]{4, 5}));
        System.out.println(solution(new int[]{1, 2 ,3}, new int[]{4, 5, 6, 7}));
        System.out.println(solution(new int[]{8, 9 ,10}, new int[]{6, 7, 8, 9}));
        System.out.println(solution(new int[]{8, 9 ,10}, new int[]{6, 7, 10, 9}));
        System.out.println(solution(new int[]{8, 9 ,10}, new int[]{6, 10}));
        System.out.println(solution(new int[]{8, 9 ,10}, new int[]{6, 1}));
        System.out.println(solution(new int[]{8, 9 ,10}, new int[]{6, 1, 15, 13}));

    }
}
