correction=0;
for(i in 1:nrow(iris)){
    x1 = iris[i,1];
    x2 =iris[i,2];
    x3 =iris[i,3];
    x4 =iris[i,4];
    term1 = exp(8.1743+21.8065*x1+4.5648*x2-26.3083*x3-43.887*x4);
    term2 = exp(42.637+2.4652*x1+6.6809*x2-9.4293*x3-18.2869*x4);
    p1 = term1/(1+term1+term2);
    p2 = term2/(1+term1+term2);
    p3 = 1/(1+term1+term2);
    predict_max = which.max(c(p1,p2,p3));
    predict_class="none";
    if(predict_max==1){
        predict_class="setosa";
    }else if(predict_max==2){
        predict_class="versicolor";
    }else if(predict_max==3){
        predict_class="virginica";
    }
    if(predict_class==iris[i,5]){
        correction=correction+1;
    }else{
        print(i);
    }
}
print(correction/nrow(iris))