m=int(input())
n=int(input())
sum_m=1
sum_n=1
sum_mn=1
for i in range(1,m+1):
    sum_m *= i        
for i in range(1,n+1):
    sum_n *= i
for i in range(1,m-n+1):
    sum_mn *= i
print(sum_m/(sum_n*sum_mn))
