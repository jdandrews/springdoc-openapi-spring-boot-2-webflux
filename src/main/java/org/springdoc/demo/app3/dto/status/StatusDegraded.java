package org.springdoc.demo.app3.dto.status;

public class StatusDegraded extends Status {
    private static final long serialVersionUID = 1L;

    public StatusDegraded(String message) {
        setStatus(message);
        setStatusCode(StatusCode.DEGRADED);
    }
}
