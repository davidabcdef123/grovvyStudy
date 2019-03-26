package com.david

/**
 * Created by sc on 2019-03-26.
 */
def str='''\
1
2
3
'''
def name = "张三"
def str2="hello:${name}"
def str3="1 add 2 equals ${1+2}"
/*
println(str2)
println(str3)*/

def result=hello(str3)
    String hello(String message){
        return message
    }

//println(result)

def str4 = "groovy hello"
println str4.center(8,"1")
println str4.padLeft(8,'1')

def str5 = "hello"
println str4 - str5

println str5[0..1]

println str5.reverse()

println str5.capitalize()

