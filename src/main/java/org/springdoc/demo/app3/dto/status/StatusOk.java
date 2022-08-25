package org.springdoc.demo.app3.dto.status;

public class StatusOk extends Status {
    private static final long serialVersionUID = 1L;

    public StatusOk() {
        super();
        setStatus("OK");
        setStatusCode(StatusCode.OK);
    }
}
