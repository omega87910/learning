def weight(h,g):
    if g == "1":
        return (h-80)*0.7
    elif g == "2":
        return (h-70)*0.6
height = int(input())
gender = input()
print(weight(height,gender))
height = int(input())
gender = input()
print(weight(height,gender))