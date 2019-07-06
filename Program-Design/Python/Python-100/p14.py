def lcm(x,y,z):
    greater = x
    if greater < y:
        greater = y
    if greater < z:
        greater = z
    while(True):
        if ((greater%x == 0) and (greater%y == 0) and (greater%z == 0 )):
            break
        greater+=1
    return greater
print(lcm(int(input()),int(input()),int(input())))
