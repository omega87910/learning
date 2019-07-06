import random as rd
rd.seed(input())
answer = rd.randint(1,100)
while True:
    inp = int(input())
    if inp > answer :
        print("big")
    elif inp < answer :
        print("small")
    elif inp == answer :
        print("true")
        break
    