v1 =input()
v2 =input()
v3 =input()
v4 =input()
space1=""
space2=""
space3=""
space4=""
for i in range(5-len(v1)):
        space1=space1+" "
for i in range(5-len(v2)):
        space2=space2+" "
print("|"+space1+str(v1)+" "+space2+str(v2)+"|")

for i in range(5-len(v3)):
        space3=space3+" "
for i in range(5-len(v4)):
        space4=space4+" "
print("|"+space3+str(v3)+" "+space4+str(v4)+"|")
print("|"+str(v1)+space1+" "+str(v2)+space2+"|")
print("|"+str(v3)+space3+" "+str(v4)+space4+"|")