iris_train = read.table("iris_train.csv",sep=",",header=TRUE);
iris_test = read.table("iris_test.csv",sep=",",header=TRUE);
dist = rep(Inf,times=nrow(iris_train));
for (j in 1:nrow(iris_test)){
  for (i in 1:nrow(iris_train)){
      dist[i] = sqrt((iris_test[j,1]-iris_train[i,1])^2+(iris_test[j,2]-iris_train[i,2])^2+(iris_test[j,3]-iris_train[i,3])^2+(iris_test[j,4]-iris_train[i,4])^2);
  }
  class_predict = iris_train[which.min(dist),5]
  print(class_predict)
}