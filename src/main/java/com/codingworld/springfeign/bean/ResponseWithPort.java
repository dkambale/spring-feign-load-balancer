package com.codingworld.springfeign.bean;

public class ResponseWithPort<T> {

  T data;
  String port;

  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }

  public String getPort() {
    return port;
  }

  public void setPort(String port) {
    this.port = port;
  }
}
