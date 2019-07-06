n=int(input())
def func(n1):
    if n1==0 or n1==1:
        return n1
    else:
        return func(n1-1)+func(n1-2)
print(func(n))
