X = int(input()) # 영수증에 적힌 총 금액  
N = int(input()) # 영수증에 적힌 구매한 물건의 종류의 수

total = 0
for i in range(N): # N번 반복해서
    a, b = map(int, input().split()) # 물건의 가격과 갯수를 입력
    total += a * b # 입력받은 가격에 갯수를 곱해서 총액을 구한다.

print("Yes" if X == total else "No") # 영수증 총 금액과, 계산한 총액을 비교한다.
