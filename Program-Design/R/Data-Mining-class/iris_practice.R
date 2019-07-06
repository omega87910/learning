sum = 0;
for(i in 1:nrow(iris)){
    iris_test = iris[i,];
    iris_train = iris[-i,];
    
    dist = rep(Inf,times=nrow(iris_train));
    for(j in 1:nrow(iris_train)){
        dist[j]=sqrt(
            (iris_test[1,1]-iris_train[j,1])^2+
            (iris_test[1,2]-iris_train[j,2])^2+
            (iris_test[1,3]-iris_train[j,3])^2+
            (iris_test[1,4]-iris_train[j,4])^2
        );
    }
    mini = iris_train[which.min(dist),5];
    if(iris_test[1,5]==mini){
        sum = sum + 1;
    }
}
print(sum/nrow(iris))
