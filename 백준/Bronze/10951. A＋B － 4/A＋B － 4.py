while True:
    try:
        a, b = map(int, input().split())
        print(a + b)
    except:  # 반복문 종료조건이 없으므로 예외가 발생할 경우 반복문 종료
        break
