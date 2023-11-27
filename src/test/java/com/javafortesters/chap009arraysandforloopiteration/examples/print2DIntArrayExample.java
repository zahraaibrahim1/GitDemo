package com.javafortesters.chap009arraysandforloopiteration.examples;

import org.junit.Test;

public class print2DIntArrayExample {

             public void print2DIntArray(int [][]multi){
                     for(int[] outer : multi){
                if(outer==null){
                    System.out.print("null");
                }else{
                    for(int inner : outer){
                        System.out.print(inner + ",");
                    }
                }
                System.out.println("");
            }
        }
    @Test
public void triangleArrayTest(){
    
}
}

