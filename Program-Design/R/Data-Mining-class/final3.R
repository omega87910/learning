library(rpart)

data(iris)
sum=0
test.index = c()
for(i in 1:10){
  for(j in 0:14){
       test.index[j+1]=j*10+i
  }
  print(test.index)
iris.testdata = iris[test.index,]		
iris.traindata = iris[-test.index,]	       
iris.tree = rpart(Species ~  Sepal.Length + Sepal.Width +Petal.Length + Petal.Width, method="class",  data=iris.traindata )
 			
# iris.tree

# summary(iris.tree)
# par(mar=rep(0.1,4))
# plot(iris.tree) ; text(iris.tree)

# species.traindata = iris$Species[-test.index]
# train.predict=factor(predict(iris.tree, iris.traindata,type='class'), levels=levels(species.traindata))

# table.traindata =table(species.traindata,train.predict)
# print(table.traindata)
# correct.traindata=sum(diag(table.traindata))/sum(table.traindata)*100
# print(correct.traindata)

species.testdata = iris$Species[test.index]
test.predict=factor(predict(iris.tree, iris.testdata,
		type='class'), levels=levels(species.testdata)) 
table.testdata  =table(species.testdata,test.predict)
# print(table.testdata)
correct.testdata=sum(diag(table.testdata))/sum(table.testdata)*100
sum =sum +correct.testdata
# print(correct.testdata)
}
sum =sum/10
print(sum)
#93.33333