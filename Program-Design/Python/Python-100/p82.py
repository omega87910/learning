def f(n):
    if n == 1:
        return n+1
    elif n>1:
        return f(n-1)+f(int(n/2))
print(f(int(input())))