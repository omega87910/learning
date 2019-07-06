iris_test = read.table("iris_test.csv",sep=",",header=TRUE);
iris_train = read.table("iris_train.csv",sep=",",header=TRUE);
dist = rep(Inf,times=nrow(iris_train));
for(i in 1:nrow(iris_test)){
    for(j in 1:nrow(iris_train)){
        dist[j]=sqrt(
            (iris_test[i,1]-iris_train[j,1])^2+
            (iris_test[i,2]-iris_train[j,2])^2+
            (iris_test[i,3]-iris_train[j,3])^2+
            (iris_test[i,4]-iris_train[j,4])^2   
        );
    }
    class_predict=iris_train[which.min(dist),5]
    print(class_predict)
}