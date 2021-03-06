package com.trusona.sdk.http.environment;

import java.net.URL;
import java.util.Objects;

import okhttp3.logging.HttpLoggingInterceptor;

public class CustomEnvironment implements Environment {

  private final String endpointUrl;

  public CustomEnvironment(URL endpoint) {
    this.endpointUrl = endpoint.toString();
  }

  @Override
  public HttpLoggingInterceptor.Level getLoggingLevel() {
    return HttpLoggingInterceptor.Level.BASIC;
  }

  @Override
  public String getEndpointUrl() {
    return endpointUrl;
  }

  @Override
  public boolean equals(Object object) {
    return object != null && getClass().equals(object.getClass()) &&
        Objects.equals(getEndpointUrl(), ((CustomEnvironment) object).getEndpointUrl());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getEndpointUrl());
  }
}
