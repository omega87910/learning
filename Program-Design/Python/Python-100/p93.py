money = int(input())
apple = 15*int(input())
orange = 20*int(input())
peach = 30*int(input())
result =money-apple-orange-peach
if  result >=0:
    coin_50 = 0
    coin_5 = 0
    coin_1 = 0
    while result-50>=0:
        coin_50+=1
        result-=50
    while result-5>=0:
        coin_5+=1
        result-=5
    coin_1 = result
    print("%s\t%s\t%s" % (coin_1,coin_5,coin_50))
else:
    print(0)
