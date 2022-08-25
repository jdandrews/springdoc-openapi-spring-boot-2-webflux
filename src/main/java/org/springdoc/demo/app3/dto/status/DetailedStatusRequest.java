package org.springdoc.demo.app3.dto.status;

import java.util.List;

public class DetailedStatusRequest extends StatusRequest {
    private static final long serialVersionUID = 1L;

    private List<String> serviceIdList;

    public List<String> getServiceIdList() {
        return serviceIdList;
    }

    public void setServiceIdList(List<String> serviceIdList) {
        this.serviceIdList = serviceIdList;
    }

}
