find = input()
string = input()
summ=0
for i in range(len(string)):
    if i+len(find)>len(string):
        break
    if string[i:i+len(find)]==find:
        summ=summ+1
print(summ)
