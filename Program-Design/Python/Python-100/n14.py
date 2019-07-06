x=int(input())
y=int(input())
z=int(input())
def lcm(x1,y1,z1):
    for i in range(max(x1,y1,z1),(x1*y1*z1)+1):
        if(i%x1==0 and i%y1==0 and i%z1==0):
            result=i;
            break
    return result
print(lcm(x,y,z))
