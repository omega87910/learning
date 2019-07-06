MyIris100 = iris;
MyIris100[,5] = as.character(MyIris100[,5]);
for(i in 1:nrow(MyIris100)){
if( MyIris100[i,5]=="setosa" ){
MyIris100[i,5] = 1;
}
else{
MyIris100[i,5] = 0;
}
}
MyIris100[,5] = as.numeric(MyIris100[,5]);
x1 = MyIris100$Sepal.Length;
x2 = MyIris100$Sepal.Width;
x3 = MyIris100$Petal.Length;
x4 = MyIris100$Petal.Width;
y = MyIris100$Species;
result100 = glm(formula=y~x1+x2+x3+x4,family=binomial(link="logit"));

MyIris010 = iris;
MyIris010[,5] = as.character(MyIris010[,5]);
for(i in 1:nrow(MyIris010)){
if( MyIris010[i,5]=="versicolor" ){
MyIris010[i,5] = 1;
}
else{
MyIris010[i,5] = 0;
}
}
MyIris010[,5] = as.numeric(MyIris010[,5]);
x1 = MyIris010$Sepal.Length;
x2 = MyIris010$Sepal.Width;
x3 = MyIris010$Petal.Length;
x4 = MyIris010$Petal.Width;
y = MyIris010$Species;
result010 = glm(formula=y~x1+x2+x3+x4,family=binomial(link="logit"));

MyIris001 = iris;
MyIris001[,5] = as.character(MyIris001[,5]);
for(i in 1:nrow(MyIris001)){
if( MyIris001[i,5]=="virginica" ){
MyIris001[i,5] = 1;
}
else{
MyIris001[i,5] = 0;
}
}
MyIris001[,5] = as.numeric(MyIris001[,5]);
x1 = MyIris001$Sepal.Length;
x2 = MyIris001$Sepal.Width;
x3 = MyIris001$Petal.Length;
x4 = MyIris001$Petal.Width;
y = MyIris001$Species;
result001 = glm(formula=y~x1+x2+x3+x4,family=binomial(link="logit"));

fv100 = as.vector(result100$fitted.values);
fv010 = as.vector(result010$fitted.values);
fv001 = as.vector(result001$fitted.values);
correction = 0;
for (i in 1:nrow(iris)){
    prediction = which.max(c(fv100[i],fv010[i],fv001[i]));

    predicted_class = "none";
    if( prediction==1 ){
        predicted_class="setosa";
    }
    if( prediction==2 ){
        predicted_class="versicolor";
    }
    if( prediction==3 ){
        predicted_class="virginica";
    }
    if(predicted_class==iris[i,5]){
        correction = correction + 1;
    }
    else{
        cat(i,prediction,"\n")
    }
}
print(correction/nrow(iris));