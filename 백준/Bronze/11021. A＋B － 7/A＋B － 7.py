import sys

t = int(sys.stdin.readline())

for n in range(t):
    a, b = map(int, sys.stdin.readline().split())

    print(f"Case #{n+1}: {a+b}")