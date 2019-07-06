nums = input().split(" ")
for i in range(len(nums)):
    nums[i]  = int(nums[i])
print("Size: "+str(len(nums)))
print("Average: %.3f" % (sum(nums)/len(nums)))