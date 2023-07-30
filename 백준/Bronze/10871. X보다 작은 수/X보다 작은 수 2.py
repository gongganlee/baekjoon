# 입력받은 값을 공백을 기준으로 분리하고, 각각 정수로 변환한 뒤 변수에 할당
n, x = map(int, input().split()) 

# 사용자로부터 N개의 정수를 입력받아 n_list에 리스트 형태로 저장
n_list = list(map(int, input().split(" ")))

for i in n_list: # 리스트 n_list에 담긴 각각의 정수에 대해 아래의 동작을 반복
    if i < x:  # 만약 현재의 정수 i가 x보다 작다면, 이를 출력
        print(i, end=" ")  # 출력 후 줄바꿈 대신 공백을 출력
