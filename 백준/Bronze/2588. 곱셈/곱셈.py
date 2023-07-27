a = int(input())
b = int(input())
print(a * (b % 10))
print(a * ((b%100)//10))
print(a * (b//100))
print(a * b)

# b의 각 자리 수를 구하기 위해서 몫을 구하는 연산자//와 나머지를 구하는 연산자%를 사용한다.