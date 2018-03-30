/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asif Shahriar
 */
public class Number {
    
       
    public static  int generator(){
      int limit=20+1;
      int x;
      if(Home.score>10 && Home.score<=15)
            limit+=10;
       if(Home.score>15 && Home.score<=20)
            limit+=10;
     else if(Home.score>20)
            limit+=25;
        while(true){
        x = (int) (Math.random()*limit);
        if(x!=0) return x;
       }
      
      
    }
    
    public static  int minGenerator(){
       int x;
       int limit=10+1;
        if(Home.score>10 && Home.score<=15)
            limit+=5;
      if(Home.score>15 && Home.score<=20)
            limit+=10;
      else if(Home.score>20)
            limit+=20;
      while(true){
        x= (int) (Math.random()*10+1);
        if(x!=0 && x!=1) return x;
       }
      
      
    }
}
