n=int(input())
for i in range(1,n+1):
    for j in range(i,n+1):
        for k in range(j,n+1):
            if(i*i+j*j==k*k and i+j+k<=n):
                print("%d"%(i),"%d"%(j),"%d"%(k),sep="\t")
