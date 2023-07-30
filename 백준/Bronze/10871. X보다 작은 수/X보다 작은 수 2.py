N, X = map(int, input().split())

# List Comprehension 을 이용하여 입력받은 수열에서 X보다 작은 수를 찾아 새로운 리스트 arr에 저장
# 문자열을 공백 기준으로 나눈 리스트를 반환, 각 원소는 int(x)를 통해 정수로 변환
arr = [x for x in input().split() if int(x) < X] # 리스트에 저장할 때부터 값을 비교해서 작은 값만 저장
print(" ".join(arr))  # join : 리스트의 요소들을 공백으로 이어 붙여 문자열로 변환하고 출력
