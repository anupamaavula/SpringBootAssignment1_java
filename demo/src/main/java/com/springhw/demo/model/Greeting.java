package com.springhw.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Greeting {
  @Id
    private long id;
    private String content;

    public Greeting(long id,String content){
      this.id = id;
      this.content = content;
    
    }

    public Greeting(){
      
    }



  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  @Override
  public String toString() {
    return "Greeting [content=" + content + ", id=" + id + "]";
  }


  
}