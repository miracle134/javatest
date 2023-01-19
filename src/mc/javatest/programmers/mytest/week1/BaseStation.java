package mc.javatest.programmers.mytest.week1;

public class BaseStation {

    public static void main(String[] args) throws Exception {
        BaseStation baseStation = new BaseStation();

        int n = 16;
        int[] stations = {9};
        int w = 2;

        System.out.println("리턴 값 : " + baseStation.solution(n, stations, w));

    }

    public int solution(int n, int[] stations, int w) {
        int answer = 0;
        int position = 1;
        int stationIndex = 0;

        while(position <= n){
            if(stationIndex < stations.length && stations[stationIndex] - w <= position){
                position = stations[stationIndex] + w + 1;
                stationIndex++;
            }else{
                answer++;
                position += 2 * w + 1;
            }
        }

        return answer;
    }

}
