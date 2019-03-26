package com.david

import java.awt.print.PrinterGraphics

/**
 * Created by sc on 2019-03-26.
 */

//闭包
/*def clouser= {
    return "hello"
}
println(clouser.call())

def clouser2={ return "hello ${it}"}
println(clouser2.call())

def clouser3={ println  item ++}
clouser3.call()*/

/*
c= { it }
println(c('run'))*/

/*
int x=10
//用来求指定number的阶乘
int fab(int number){
    int result=1
    //result = result * num
    1.upto(number,{num->result*=num})
    return result
}

println( fab(5))
*/

/*3.times {println(it)}*/

/*
for(int i=0;i<3;i++){
    print(i)
}
*/

/**
* Author: sc
* Since: 2019-03-26
* Describe:字符串
* Update: [变更日期YYYY-MM-DD][更改人姓名][变更描述]
*/
String str='012abcd45'
/*str.each {String temp->println(temp)}*/

//println( str.find{String s-> s.isNumber()})

class Person {
    def static classClouser ={
        println( "scriptClouser this:"+this)//代表闭包定义处的类
        println( "scriptClouser owner:"+owner)//代表闭包定义处的类或对象
        println( "scriptClouser delegate:"+delegate)//代表任意对象，默认与owner一样
    }
    def static say() {
        def classClouser = {
            println "scriptClouser this:"+this    //代表闭包定义处的类
            println "scriptClouser this:"+owner  //代表闭包定义处的类或对象
            println "scriptClouser this:"+delegate //代表任意对象，默认与owner一样
        }
        classClouser.call()
    }
}

//Person.classClouser.call()

//Person.say()



def nestClouser = {
    def innerClouser = {
        println "innserClouser this:"+this    //代表闭包定义处的类
        println "innserClouser this:"+owner  //代表闭包定义处的类或对象
        println "innserClouser this:"+delegate //代表任意对象，默认与owner一样
    }
    innerClouser.call()

    println "nestClouser this:"+this    //代表闭包定义处的类
    println "nestClouser this:"+owner  //代表闭包定义处的类或对象
    println "nestClouser this:"+delegate //代表任意对象，默认与owner一样
}
nestClouser.call()


