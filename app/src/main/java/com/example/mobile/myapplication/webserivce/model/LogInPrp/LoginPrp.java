package com.example.mobile.myapplication.webserivce.model.LogInPrp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoginPrp {

@SerializedName("response")
@Expose
private Response response;

public Response getResponse() {
return response;
}

public void setResponse(Response response) {
this.response = response;
}

}