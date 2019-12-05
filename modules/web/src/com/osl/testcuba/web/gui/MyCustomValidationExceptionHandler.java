package com.osl.testcuba.web.gui;

import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.exception.AbstractUiExceptionHandler;
import org.springframework.stereotype.Component;

import javax.annotation.Nullable;

@Component("testcuba_MyCustomValidationException")
public class MyCustomValidationExceptionHandler extends AbstractUiExceptionHandler {

    MyCustomValidationExceptionHandler()
    {
        super("com.osl.testcuba.MyCustomValidationException");
    }
    @Override
    protected void doHandle(String className, String message, @Nullable Throwable throwable, UiContext context) {
        context.getNotifications().create(Notifications.NotificationType.ERROR)
                .withCaption("Error")
                .withDescription(message)
                .show();
    }

}
