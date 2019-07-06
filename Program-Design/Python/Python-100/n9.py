string=""
for i in range(5):
    string=string+input()+"\n"
file = open("write.txt","w")
file.write(string)
file.close()