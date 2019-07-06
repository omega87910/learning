library('arules')
data('Adult')
rules = apriori(Adult,parameter = list(supp= 0.5, conf =0.9),control=list(verbose=F))
rules.sorted = sort(rules,by='confidence')
inspect(rules.sorted)

is = apriori(Adult,parameter = list(supp = 0.5, conf = 0.9),appearance = list(none = c("race=White", "sex=Male")),control=list(verbose=F))
itemFrequency(items(is))["race=White"]
itemFrequency(items(is))["sex=Male"]
is.sorted=sort(is,by='confidence')
inspect(is.sorted)