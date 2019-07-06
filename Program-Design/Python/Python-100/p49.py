n = int(input())
summ=0
for i in range(n):
    summ+=i
    if summ>=n:
        print(i)
        break