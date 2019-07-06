n = int(input())
for i in range(1,n):
    for j in range(i,n):
        for k in range(j,n):
            if pow(i,2)+pow(j,2)==pow(k,2):
                print(str(i)+"\t"+str(j)+"\t"+str(k))
            if i+j+k>n:
                break
