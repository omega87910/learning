n = input()
summ=0
for i in range(len(n)):    
    if ord(n[i]) >= 48 and ord(n[i]) <= 57:
        summ+=int(n[i])
print(summ)