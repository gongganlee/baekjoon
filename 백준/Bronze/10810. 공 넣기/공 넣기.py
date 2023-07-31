n, m = map(int, input().split())
basket = [0] * n  # 바구니 초기화

for _ in range(m):  # m번 공을 넣는 과정
    
    # i번~j번 바구니까지 k번 공을 넣는다. 기존에 들어있던 공은 새로운 공으로 대체된다.
    i, j, k = map(int, input().split())

    # 인덱스는 0부터 시작하므로 i-1부터 j까지의 범위에 k를 넣음
    # k를 (j-i+1)번 반복하여 새로운 리스트를 만든다.
    basket[i - 1 : j] = [k] * (j - i + 1)

# 결과 출력
for ball in basket:
    print(ball, end=" ")
