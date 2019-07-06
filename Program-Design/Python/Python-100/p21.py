a = float(input())
b = float(input())
c = float(input())
if pow(a,2) + pow(b,2) == pow(c,2):
    print("Right triangle")
elif pow(a,2) + pow(b,2) > pow(c,2):
    print("Acute triangle")
elif pow(a,2) + pow(b,2) < pow(c,2):
    print("Obtuse triangle")
