package app.controllers.dto.iperf;

import java.util.List;

public class SendReceiveDto {
    StreamDto sender;
    StreamDto receiver;

    public StreamDto getSender() {
        return sender;
    }

    public void setSender(StreamDto sender) {
        this.sender = sender;
    }

    public StreamDto getReceiver() {
        return receiver;
    }

    public void setReceiver(StreamDto receiver) {
        this.receiver = receiver;
    }
}
