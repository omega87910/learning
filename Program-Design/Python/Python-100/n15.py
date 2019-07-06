def C(m1,n1):
    m=n=mn=1
    for i in range(2,m1+1):
        m=m*i
    for i in range(2,n1+1):
        n=n*i
    for i in range(2,m1-n1+1):
        mn=mn*i
    return m/(n*mn)
m=int(input())
n=int(input())
print(int(C(m,n)))
