data(iris)
index <- 1:nrow(iris)
np <- ceiling(0.1*nrow(iris))       
idx <- sample(1:nrow(iris),np)
irisSample <- iris[idx,]
irisSample$Species <- NULL
hc <- hclust(dist(irisSample), method="complete")
plot(hc, labels=iris$Species[idx])
print(rect.hclust(hc, k=3))