package main;

import org.springframework.stereotype.Component;

//here is used stereotype annotations
@Component
public class ManSword {
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
