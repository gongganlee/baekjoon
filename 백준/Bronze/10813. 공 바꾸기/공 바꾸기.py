n, m = map(int, input().split())  # 바구니의 수 n과 공을 교환할 횟수 m 입력
basket = list(range(1, n + 1))  # basket 리스트에 1부터 n까지 숫자를 넣는다.

for _ in range(m):  # m번 공을 교환
    j, i = map(int, input().split())  # i번 바구니와 j번 바구니의 공을 교환해야 하므로 i, j 값을 입력 받음
    basket[i - 1], basket[j - 1] = basket[j - 1], basket[i - 1]
    # i와 j의 위치에 있는 공을 교환 (인덱스는 0부터 시작하므로 1을 빼줌)

print(*basket)  # 리스트 전체를 공백으로 구분해 출력