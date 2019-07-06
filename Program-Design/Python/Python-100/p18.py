def number(num,times):
    if num/10 != 0:
        num /= 10
        return number(int(num),times+1)
    else:
        return times
print(number(int(input()),0))
