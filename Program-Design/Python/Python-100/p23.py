denomination = int(input())
string=""
if denomination<=1000:
    if denomination == 1000:
        string = str(int(denomination/1000)) + " thousand "
    if denomination>=100:
        string = string + str(int(denomination/100%10))+ " hundred "
    if denomination>=10:
        string = string + str(int(denomination/10%10)) + " ten "
    if denomination>=0:
        string = string + str(denomination%10) + " dollar"
print(string)