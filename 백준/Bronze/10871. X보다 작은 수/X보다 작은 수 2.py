n, x = map(int, input().split())
n_list = list(map(int, input().split(" ")))
for i in n_list:
    if i < x:
        print(i, end=" ")  # 출력시 개행처리 삭제
