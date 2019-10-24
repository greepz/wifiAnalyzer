package app.controllers.dto.iperf;

import java.util.List;

public class SendReceiveDto {
    List<StreamDto> sender;
    List<StreamDto> receiver;

    public List<StreamDto> getSender() {
        return sender;
    }

    public void setSender(List<StreamDto> sender) {
        this.sender = sender;
    }

    public List<StreamDto> getReceiver() {
        return receiver;
    }

    public void setReceiver(List<StreamDto> receiver) {
        this.receiver = receiver;
    }
}
