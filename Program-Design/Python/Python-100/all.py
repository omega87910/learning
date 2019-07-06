nums=[]
n = int(input())
string=""
for i in range(n):
    nums.append(input())
    string=string+"1"
times=0
while times<int(string,2):
    times+=1
    times_bin=str(bin(times))
    times_bin=times_bin[2::]
    C=""
    for i in range(n-len(times_bin)):
        times_bin = "0"+times_bin
    for i in range(len(times_bin)):
        if times_bin[i]=="1":
            C = C+str(nums[i])
    print(C)
