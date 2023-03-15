package com.example.earthidlibservice;


public interface Results {

    void onResponse(VerificationResults response);
    void onError(Throwable response);

}
