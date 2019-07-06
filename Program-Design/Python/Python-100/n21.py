a=int(input())
b=int(input())
c=int(input())
if a<b and b<c :
    if pow(a,2)+pow(b,2)==pow(c,2):
        print("Right triangle")
    elif pow(a,2)+pow(b,2)<pow(c,2):
        print("Obtuse triangle")
    elif pow(a,2+pow(b,2))>pow(c,2):
        print("Acute triangle")
