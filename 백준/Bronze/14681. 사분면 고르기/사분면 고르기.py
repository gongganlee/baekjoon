x = int(input())
y = int(input())
if x > 0:
    print(1 if y > 0 else 4)
else:
    print(2 if y > 0 else 3)
    
# x:양수,y:양수 1사분면
# x:음수,y:양수 2사분면
# x:음수,y:음수 3사분면
# x:양수,y:음수 4사분면
