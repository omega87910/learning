x = int(input())
if x < -1:
    y=3*pow(x,2)
elif x>=-1 and x<=1:
    y=pow(x,3)+3*x-3
elif x > 1:
    y=2*x+3
print(y)
