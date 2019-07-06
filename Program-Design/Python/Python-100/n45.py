import random as rd
rd.seed(input())
answer=rd.randint(1,100)
while True:
    a=int(input())
    if a<answer:
        print("small")
    elif a>answer:
        print("big")
    else:
        print("true")
        break
