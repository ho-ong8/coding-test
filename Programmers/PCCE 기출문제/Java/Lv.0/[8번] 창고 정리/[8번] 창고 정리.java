class Solution {
    public String solution(String[] storage, int[] num) {
        int num_item = 0;
        String[] clean_storage = new String[storage.length];
        int[] clean_num = new int[num.length];

        for (int i = 0; i < storage.length; i++) {
            int clean_idx = -1;

            for (int j = 0; j < num_item; j++) {
                // equals(): 문자열 비교
                if (storage[i].equals(clean_storage[j])) {
                    clean_idx = j;
                    break;
                }
            }

            // 인덱스가 -1일 경우
            if (clean_idx == -1) {
                clean_storage[num_item] = storage[i];
                clean_num[num_item] = num[i];
                num_item += 1;
            } else {
                clean_num[clean_idx] += num[i];
            }
        }

        int num_max = -1;
        String answer = "";

        for (int i = 0; i < num_item; i++) {
            // 가장 개수가 많은 물건일 경우
            if (clean_num[i] > num_max) {
                num_max = clean_num[i];
                answer = clean_storage[i];
            }
        }

        return answer;
    }
}
