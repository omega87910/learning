//
//  main.swift
//  MyFirst
//
//  Created by mickey on 2020/3/16.
//  Copyright © 2020 mickey. All rights reserved.
//

import Foundation

class Score{
    var score:Int = 0{
        willSet(newScore){
           print("你的分數是\(score)")
        }
        didSet{
            if(score > oldValue){
                print("你的分數進步\(score - oldValue)")
            }else{
                print("你的分數退步\(oldValue - score)")
            }
        }
    }
}
var s = Score()
s.score = 70
s.score = 60
s.score = 80
