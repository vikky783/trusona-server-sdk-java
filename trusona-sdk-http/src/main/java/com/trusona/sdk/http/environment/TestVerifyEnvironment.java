package com.trusona.sdk.http.environment;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import okhttp3.logging.HttpLoggingInterceptor;

public class TestVerifyEnvironment implements Environment {

  private static final String ENDPOINT_URL = "https://api.verify.trusona.net";

  @Override
  public HttpLoggingInterceptor.Level getLoggingLevel() {
    return HttpLoggingInterceptor.Level.BASIC;
  }

  @Override
  public String getEndpointUrl() {
    return ENDPOINT_URL;
  }

  @Override
  public boolean equals(Object object) {
    return object != null && getClass().equals(object.getClass()) && EqualsBuilder
        .reflectionEquals(this, object);
  }

  @Override
  public int hashCode() {
    return HashCodeBuilder.reflectionHashCode(7179, 71857, this);
  }
}
