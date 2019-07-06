n=int(input())
if n>=0:
    n = bin(n)[2:]
else:
    n=bin(128+n)[2:]
while len(n)<8:
    n="0"+n
print(n)