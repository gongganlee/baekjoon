h, m = map(int, input().split())
m -= 45
if (m < 0):
    m += 60
    h -= 1
    if (h < 0):
        h = 23
print(h, m)

# 시를 받는 변수h, 분을 받는 변수m
# m에서 45를 뺀다.
# m이 양수라면 그대로 h와 m을 출력
# m이 음수라면 m에 +60 / h에 -1
# h가 양수라면 그대로 h와 m을 출력
# h가 음수라면 h에 +24