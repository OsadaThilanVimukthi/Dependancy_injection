package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class test1 {
    

    private int testid;
    private String testName;
    private String testA;

    public void setTestid(int testid)
{
    this.testid=testid;
}
public  int getTestid(){
    return testid;
}

public  void setTestname(String testName){
    this.testName=testName;
}
public String getTestname(){
    return testName;
}
public void setTestA(){
   this.testA=testA;
}
public String getTestA(){
return testA;
}

public void show(){
    System.out.println("in show");
}

}
