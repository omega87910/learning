a = []
a.append(input().split(sep=" "))
a.append(input().split(sep=" "))
a.append(input().split(sep=" "))
result = "False"
for i in range(0,3):
        if a[i][0] == a[i][1] == a[i][2]:
            result = "True"
            break
        elif a[0][i] == a[1][i] == a[2][i]:
            result = "True"
            break
        elif a[0][0] == a[1][1] == a[2][2]:
            result = "True"
            break
        elif a[0][2] == a[1][1] == a[2][0]:
            result = "True"
            break
print(result)