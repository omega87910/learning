n1 = int(input())
n2 = int(input())
m1 = int(input())
m2 = int(input())
nums1 =[]
nums2 =[]
for i in range(n1):
    nums1.append([])
    for j in range(n2):
        nums1[i].append(int(input()))
for i in range(m1):
    nums2.append([])
    for j in range(m2):
        nums2[i].append(int(input()))
for i in range(len(nums1)):
    for k in range(len(nums1)):
        summ=0
        for j in range(len(nums1[i])):
            summ=summ+nums1[i][j]*nums2[j][k]
        print(summ,end="\t")
    print()
