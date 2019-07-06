x = int(input())
y = int(input())
c = int(pow(pow(x,2)+pow(y,2),1/2))
if c > 100:
    print("outside")
else:
    print("inside")