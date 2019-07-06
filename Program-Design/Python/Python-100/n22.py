m = int(input())
n = int(input())
def gcd(m1, n1):
    gc=min(m1,n1)
    if max(m1, n1) % min(m1, n1) != 0:
        box=max(m1,n1)
        n1=min(m1,n1)
        m1=box
        m1=m1%n1
        return gcd(m1,n1)
    else:
        return gc
print(gcd(m, n))
