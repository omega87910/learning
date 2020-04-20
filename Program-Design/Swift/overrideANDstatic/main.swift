//
//  main.swift
//  MyFirst
//
//  Created by mickey on 2020/3/16.
//  Copyright © 2020 mickey. All rights reserved.
//

import Foundation

class Person{
    static var body:Int{
        return 123
    }
    class var name:String{
        return "12"
    }
}
class Human:Person{
    override class var name: String{
        return "mickey"
    }
}
print(Human.name)
print(Person.body)
