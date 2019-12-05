package com.osl.testcuba;

public interface Messenger {
    static final String NAME="testcuba_messenger";
    String sendUiNotificationEvent(String message);
    String sendBeanNotificationEvent();
}
