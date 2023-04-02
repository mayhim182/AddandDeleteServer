package com.mayank.servers.enumeration;

public enum Status {
  SERVER_UP("SERVER_UP"),
  SERVER_DOWN("SERVER_DOWN");

  private final String status;

  Status(String status){
    this.status=status;
  }

  //Writing a getter method
  public String getStatus(){
    return this.status;
  }


}
