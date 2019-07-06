n = int(input())
ans=""
if n%4==0:
    if n%100==0:
        if n%400==0:
            print("Bissextile Year")
        else:
            print("Common Year")
    else:
        print("Bissextile Year")
else:
    print("Common Year")