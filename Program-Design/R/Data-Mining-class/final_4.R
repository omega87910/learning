#install.packages("C50")
library(C50)
data(iris)
sum = 0
test.index = c()
for(i in 1:10){
  for(j in 0:14){
       test.index[j+1]=j*10+i
  }
  print(test.index)
# np = ceiling(0.1*nrow(iris))        
# test.index = sample(1:nrow(iris),np)
iris.test = iris[test.index,]  	    
iris.train = iris[-test.index,]	    
c=C5.0Control(subset = FALSE,
              bands = 0,
              winnow = FALSE,
              noGlobalPruning = FALSE,
              CF = 0.25,
              minCases = 2,
              fuzzyThreshold = FALSE,
              sample = 0,
              seed = sample.int(4096, size = 1) - 1L,
              earlyStopping = TRUE
              )
iris_treeModel <- C5.0(x = iris.train[, -5], y = iris.train$Species,control =c)
summary(iris_treeModel)
test.output=predict(iris_treeModel, iris.test[, -5], type = "class")
n=length(test.output)
number=0
for( k in 1:n)
{
  if (test.output[k] == iris.test[k,5])
  {
    number=number+1
  }
}
test.accuracy=number/n*100
sum=sum+test.accuracy
print(sum)
}
sum=sum/10
sum
#92