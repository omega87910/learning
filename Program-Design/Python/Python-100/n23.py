a=int(input())
if a>=0:
    str="%d dollar"%(a%10)
    a=int(a/10)
    if a>0:
        str="%d ten "%(a%10)+str
        a=int(a/10)
        if a>0:
            str="%d hundred "%(a%10)+str
            a=int(a/10)
            if a>0:
                str="%d thousand "%(a%10)+str
                print(str)
            else:
                print(str)
        else:
            print(str)
    else:
        print(str)

