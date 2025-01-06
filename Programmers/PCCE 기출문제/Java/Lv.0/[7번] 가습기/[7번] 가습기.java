class Solution {
    public int func1(int humidity, int val_set) {
        // 설정값이 클 경우
        if (humidity < val_set) {
            return 3;
        }

        return 1;
    }

    public int func2(int humidity) {
        // 50 이상일 경우
        if (humidity >= 50) {
            return 0;
        // 40 이상일 경우
        } else if (humidity >= 40) {
            return 1;
        // 30 이상일 경우
        } else if (humidity >= 30) {
            return 2;
        // 20 이상일 경우
        } else if (humidity >= 20) {
            return 3;
        // 10 이상일 경우
        } else if (humidity >= 10) {
            return 4;
        } else {
            return 5;
        }
    }

    public int func3(int humidity, int val_set) {
        // 설정값이 클 경우
        if (humidity < val_set) {
            return 1;
        }

        return 0;
    }

    public int solution(String mode_type, int humidity, int val_set) {
        int answer = 0;

        // equals(): 문자열 비교
        // "auto"일 경우
        if (mode_type.equals("auto")) {
            answer = func2(humidity);
        // "target"일 경우
        } else if (mode_type.equals("target")) {
            answer = func1(humidity, val_set);
        // "minimum"일 경우
        } else if (mode_type.equals("minimum")) {
            answer = func3(humidity, val_set);
        }

        return answer;
    }
}
