def decomp(string):
    for i in range(len(string)-1):
        print(string[i]+" ",end="")
    print(string[len(string)-1])
decomp(input())
