N, M = map(int, input().split())
baskets = [0]*N

for _ in range(M):
    i, j, k = map(int, input().split())
    baskets[i-1:j] = [k]*(j-i+1)

print(*baskets)

#  결과를 출력할 때 print(*baskets)를 사용하여 리스트를 공백으로 구분된 문자열로 변환하여 출력합니다. 
#  * 연산자는 리스트나 튜플의 원소를 개별적인 인자로 전달하는 역할을 합니다. 
#  따라서 print(*baskets)는 baskets 리스트의 각 원소를 공백으로 구분하여 출력합니다.
