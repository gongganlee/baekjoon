n = int(input())  # n번째 줄
sum = 0
for i in range(n):  # n번 반복하면서 *이 1개씩 늘어남
    sum += 1
    print("*" * sum)