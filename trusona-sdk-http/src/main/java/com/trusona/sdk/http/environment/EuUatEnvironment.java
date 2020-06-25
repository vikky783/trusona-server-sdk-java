package com.trusona.sdk.http.environment;

import static org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals;
import static org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode;

import okhttp3.logging.HttpLoggingInterceptor;

public class EuUatEnvironment implements Environment {

  private static final String ENDPOINT_URL = "https://api.staging.eu.trusona.net";

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
    return object != null && getClass().equals(object.getClass()) && reflectionEquals(this, object);
  }

  @Override
  public int hashCode() {
    return reflectionHashCode(1787, 73839, this);
  }
}
