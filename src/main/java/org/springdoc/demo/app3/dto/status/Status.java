package org.springdoc.demo.app3.dto.status;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({ 
    @Type(value = StatusOk.class, name = "ok"),
    @Type(value = StatusDegraded.class, name = "degraded") 
  })
public class Status implements Serializable {
    private static final long serialVersionUID = 1L;
    public enum StatusCode{OK, DEGRADED, FAILED};

    private String status;
    private StatusCode statusCode;

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public StatusCode getStatusCode() {
        return statusCode;
    }
    public void setStatusCode(StatusCode statusCode) {
        this.statusCode = statusCode;
    }
}
