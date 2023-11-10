import sys

T = int(sys.stdin.readline())  # 빠른 입력 

for i in range(T):
    A, B = map(int, sys.stdin.readline().split())

    print(A + B)
