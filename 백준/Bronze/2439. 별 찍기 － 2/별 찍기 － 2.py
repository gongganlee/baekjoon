n = int(input())  # n번째 줄

for i in range(n):  # n번 반복하면서 *이 1개씩 늘어남
    i += 1
    print(" " * (n - i) + "*" * i)  # 별 앞의 공백은 (n-별의갯수) + n개의 별이 오른쪽 정렬.  
