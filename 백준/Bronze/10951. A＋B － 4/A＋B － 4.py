import sys

while True:
    try:
        a, b = map(int, sys.stdin.readline().split())
    except ValueError:  # 입력을 하지 않을 때 예외처리 
        break
    else:
        print(a + b)
