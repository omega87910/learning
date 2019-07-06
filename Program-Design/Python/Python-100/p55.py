n = []
for i in range(5):
    n.append(int(input()))
box=0
for i in range(len(n)):
    for j in range(len(n)):
        if n[i] < n[j] and i!=j:
            box = n[j]
            n[j] = n[i]
            n[i] = box
for i in range(len(n)):
    print(n[i])
