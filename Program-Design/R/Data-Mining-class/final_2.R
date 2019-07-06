sum = 0
test.index=c()
for(k in 1:10){
  for(j in 0:14){
       test.index[j+1]=j*10+k
  }
    correction = 0;
    MyIris=iris;
    iris_test = MyIris[test.index,];
    iris_train = MyIris[-test.index,];
    dist = rep(Inf,times=nrow(iris_train));
    for(d in 1:nrow(iris_test)){
         for(i in 1:nrow(iris_train)){
             dist[i] = sqrt((iris_test[d,1]-iris_train[i,1])^2+
                     (iris_test[d,2]-iris_train[i,2])^2+
                     (iris_test[d,3]-iris_train[i,3])^2+
                     (iris_test[d,4]-iris_train[i,4])^2);
            };   
        prediction = iris_train[which.min(dist),5]
        if(prediction == iris_test[d,5]){
            correction = correction + 1;
        }
    }
    sum=sum+correction/nrow(iris_test)
    print(test.index)
}
print(sum)
sum=sum/10
print(sum)
#0.96