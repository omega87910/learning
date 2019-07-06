string =[]
string.append([])
string[0].append("ID")
string[0].append("NAME")
string[0].append("Chinese")
string[0].append("English")
string[0].append("Math")
string[0].append("Avg")

chinese_avg = 0
english_avg = 0
math_avg = 0
for i in range(1,6):
    string.append([])
    string[i].append(input())
    string[i].append(input())
    string[i].append(input())
    string[i].append(input())
    string[i].append(input())
    string[i].append((int(string[i][2])+int(string[i][3])+int(string[i][4]))/3)
chinese_avg = (int(string[1][2])+int(string[2][2])+int(string[3][2])+int(string[4][2])+int(string[5][2]))/5
english_avg = (int(string[1][3])+int(string[2][3])+int(string[3][3])+int(string[4][3])+int(string[5][3]))/5
math_avg = (int(string[1][4])+int(string[2][4])+int(string[3][4])+int(string[4][4])+int(string[5][4]))/5

string.append([])
string[6].append("AVG:")
string[6].append(" ")
string[6].append(chinese_avg)
string[6].append(english_avg)
string[6].append(math_avg)
for i in range(1,6):    
    for j in range(1,6):
        if string[i][5]>string[j][5]:
            box = string[i]
            string[i]=string[j]
            string[j]=box

for j in range(0,len(string)):    
    for i in range(0,len(string[j])):
        print(str(string[j][i])+"\t",end="")
    print()
    