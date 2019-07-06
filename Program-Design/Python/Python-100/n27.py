minute=int(input())
if minute<600:
    minute*=0.5
elif minute>=600 and minute<=1200:
    minute*=0.5*0.9
else:
    minute*=0.5*0.79
print(minute)
