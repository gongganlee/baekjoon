n = int(input())  # 정수의 개수 입력
n_list = list(map(int, input().split()))  # 받은 정수 값을 공백 기준으로 구분하여 리스트로 묶음
v = int(input())  # 찾으려고 하는 정수 v 입력
print(n_list.count(v))  # 리스트에서 특정 값의 개수 구하기 (리스트a에서 v의 개수)