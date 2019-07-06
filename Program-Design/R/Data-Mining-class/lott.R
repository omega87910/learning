all=c(1:21)
rand_len =as.numeric(readline()) ##隨機幾組樂透
times = 0 ##從頭跑到尾
prize = 0 ##累計獎金
howManyPrize = 0 ##總共中了多少獎
a  <- function(){
    times <<- times+1
    winning = intersect(x=lotto_rand[times,],y=lott_ans[1:6])
    if (length(winning)>0) {
        winning_matrix[times,1:length(winning)] <<- winning
        x = switch(length(winning),0,10,100,1000,10000,1000000)
        what_prize=switch(length(winning),"-----","參加獎","中五獎","中四獎","中三獎","中頭獎")
        if(length(winning)>=2){##至少中兩個才有得獎
            howManyPrize <<- howManyPrize+1
        }
        if(length(winning)==5 && length(intersect(x=lotto_rand[times,],y=lott_ans[7])==1 )){##特別獎
            x = 100000;
            what_prize="中二獎"
        }
        prize <<- prize+x
    }else {##什麼都沒中
      what_prize="-----"
    }
    whatprize_matrix[times,] <<- what_prize
    prize_matrix[times,] <<- prize
}
lott_ans=sample(all, size=7, replace = FALSE, prob = NULL)##中獎號碼

##亂數樂透的部份
lotto_rand=replicate(rand_len,sample(all, size=6, replace = FALSE, prob = NULL))
lotto_rand=t(lotto_rand)
#####

##獎金的部份
prize_matrix=matrix(0,nrow = rand_len, ncol = 1)
#####

##中什麼獎的部份
whatprize_matrix=matrix("",nrow = rand_len, ncol = 1)
#####

##中獎框架的部份
winning_matrix = matrix("", nrow = rand_len, ncol = 6)
replicate(rand_len,a());
#####

lotto_rand=as.data.frame(lotto_rand)##轉換成資料框架
winning_matrix=as.data.frame(winning_matrix)
prize_matrix=as.data.frame(prize_matrix)
whatprize_matrix=as.data.frame(whatprize_matrix)

##最後生成的部份
final_data = cbind(cbind(cbind(lotto_rand,whatprize_matrix),prize_matrix),winning_matrix)##合併資料框架
colnames(final_data) =c("投","注","號","碼","","","中獎","累計獎金","中","獎","號","碼","","")##欄頭
cat("開獎號碼：",lott_ans[1:6],"特別號：",lott_ans[7],"\r\n","\r\n")
cat("中獎組數：",howManyPrize,"\r\n")
cat("獎金：",prize,"\r\n","\r\n")
print(final_data)
