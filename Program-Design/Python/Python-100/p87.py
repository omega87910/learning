string = input().split(" ")
for i in range(len(string)):
    string[i]=string[i].lower()
flag = True
while flag:
    flag = False
    tar =""
    for i in range(len(string)):
        for j in range(i+1,len(string)):
            if string[i] == string[j]:
                flag = True
                tar = j
    if flag:
        string.pop(tar)
    else:
        for i in string:
            print(i,end=" ")
        print()
