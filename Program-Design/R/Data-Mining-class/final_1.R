data(iris)
iris2 = iris
iris2$Species = NULL
kmeans.result = kmeans(iris2, 3)
table(iris$Species, kmeans.result$cluster)

