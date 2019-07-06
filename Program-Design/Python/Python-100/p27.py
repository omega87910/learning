minute  = int(input())
count=0
if minute >1200:
    count = count + minute*0.79*0.5
if minute >=600 and minute<=1200:
    count = count + minute*0.5*0.9
if minute < 600:
    count = count + minute*0.5 
print(count)