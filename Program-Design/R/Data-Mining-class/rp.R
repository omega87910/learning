library(rpart)
data(iris)
np = ceiling(0.1*nrow(iris))
for( i in 1:10){
    test.index = sample(1:nrow(iris),np)
    iris.testdata = iris[test.index,]
    iris.traindata = iris[-test.index,]
    iris.tree = rpart(Species ~ Sepal.Length + Sepal.Width + Petal.Length + Petal.Width, method="class",data=iris.traindata)    
    species.traindata = iris$Species[-test.index]
    train.predict = factor(predict(iris.tree,iris.traindata , type="class"),levels=levels(species.traindata))
    table.traindata = table(species.traindata,train.predict)
    correct.traindata =sum(diag(table.traindata))/sum(table.traindata)*100
    species.testdata = iris$Species[test.index]
    test.predict = factor(predict(iris.tree,iris.testdata,type="class"),levels=levels(species.testdata))
    table.testdata = table(species.testdata,test.predict)
    
    print(correct.traindata)
    print(table.testdata)
}