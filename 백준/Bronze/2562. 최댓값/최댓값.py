num = []  # 빈 리스트 num을 생성. 입력받은 숫자들이 저장될 예정
for i in range(9):  # for 반복문을 이용하여 9번 반복을 수행
    num.append(int(input()))  # append 함수를 이용해 끝에 하나씩 추가
print(max(num))  # 최댓값을 출력.
print(num.index(max(num)) + 1)  # index는 0부터 시작하므로 index값에 1을 더해서 몇 번째 수인지 출력.