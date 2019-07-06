nums=[]
n = int(input())
string=""
for i in range(n):
    nums.append(input())
    string=string+"1"
times=0
while times<int(string,2):
    times+=1
print(string)
print(times)