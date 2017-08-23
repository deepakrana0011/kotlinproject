package com.example.mobile.myapplication.webserivce.model.LogInPrp;

import com.example.mobile.myapplication.webserivce.Api;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.jetbrains.annotations.NotNull;

import retrofit2.Call;

public class Data{

@SerializedName("id")
@Expose
private Integer id;
@SerializedName("parentAvial")
@Expose
private String parentAvial;
@SerializedName("message")
@Expose
private String message;

public Integer getId() {
return id;
}

public void setId(Integer id) {
this.id = id;
}

public String getParentAvial() {
return parentAvial;
}

public void setParentAvial(String parentAvial) {
this.parentAvial = parentAvial;
}

public String getMessage() {
return message;
}

public void setMessage(String message) {
this.message = message;
}

}