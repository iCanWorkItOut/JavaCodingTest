package javastudy.codingtest;

import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * 컴퓨터 내 용량 구하기
 * 컴퓨터에 여러가지 파일이 있다. 파일의 종류는 다음과 같다.
 * music (확장자 : mp3, aac, flac)
 * image (확장자 : jpg, bmp, gif)
 * movile (확장자 : mp4, avi, mkv)
 * other (위와 다른 확장자들, 예 : 7z, txt, zip)
 *
 * 하나의 문자열로 아래처럼 당신의 컴퓨터에 있는 파일명과 용량이 입력된다고 했을때 각 종류별로 용량을 계산하여 출력하라.
 * 출력의 순서는 music > images > movies > other 순서이다.
 *
 * 입력은 하나의 문자열이고, 하나의 파일명과 용량 문장은 ‘\n’으로 구분되며 용량의 단위는 ‘b’이다. 파일명과 용량은 공백 ‘ ‘으로 구분된다.
 *
 * 입력 예시:
 * “mv.song.mp3 11b
 * greatSong.flac 1000b
 * not3.txt 5b
 * video.mp4 200b
 * game.exe 100b
 * mov!e.mkv 10000b”
 *
 * 출력 :
 * 	“music 1011b
 * 	images 0b
 * 	movies 10200b
 * 	other 105b”
 *
 * public String solution(String s){
 *   // 코드 작성
 * }
 */
public class GetFileCapacity {
    private static String solution(String s) {
        // 입력된 문자열을 파일 별로 나눔
        String[] file = s.split("\n");

        int music = 0;
        int images = 0;
        int movies = 0;
        int others = 0;
        for(int i = 0; i < file.length; i++) {
            // 각 파일을 파일명과 용량으로 나눔
            String[] fileInfo = file[i].split(" ");
            // 파일의 용량(문자열)에서 단위 'b'를 제거하고 숫자만 남김
            fileInfo[1] = fileInfo[1].replace("b", "");
            // 파일명의 확장자를 정규식으로 구분 + 해당하는 종류에 용량을 숫자로 바꾸어 더함
            if (Pattern.matches("^\\S+(?i)(\\.+mp3|aac|flac)$", fileInfo[0])) {
                music += Integer.parseInt(fileInfo[1]);
            } else if (Pattern.matches("^\\S+(?i)(\\.+jpg|bmp|gif)$", fileInfo[0])) {
                images += Integer.parseInt(fileInfo[1]);
            } else if (Pattern.matches("^\\S+(?i)(\\.+mp4|avi|mkv)$", fileInfo[0])) {
                movies += Integer.parseInt(fileInfo[1]);
            } else {
                others += Integer.parseInt(fileInfo[1]);
            }
        }

        return  "music " + music + "b\n" +
                "images " + images + "b\n" +
                "movies " + movies + "b\n" +
                "other " + others + "b";
    }

    public static void main(String[] args) {
        String s = "mv.song.mp3 11b\n" +
                "greatSong.flac 1000b\n" +
                "not3.txt 5b\n" +
                "video.mp4 200b\n" +
                "game.exe 100b\n" +
                "mov!e.mkv 10000b\n";

        System.out.println(solution(s));
    }
}