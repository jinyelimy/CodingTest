class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean[] isPrime = new boolean[n + 1];

        // 2부터 n까지 모든 수를 소수(true)로 초기화
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        // 제곱근까지만 검사
        int sqrtN = (int) Math.sqrt(n);
        for (int i = 2; i <= sqrtN; i++) {
            if (isPrime[i]) {
                // i*i부터 시작하여 i의 배수를 모두 지움
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // 소수 개수 카운트
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                answer++;
            }
        }

        return answer;
    }
}