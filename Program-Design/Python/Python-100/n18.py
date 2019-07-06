a=int(input())
def test(a1,result):
    if a1/10>0:
        result+=1
        a1=int(a1/10)
        return test(a1,result)
    else:
        return result
print(test(a,0))
