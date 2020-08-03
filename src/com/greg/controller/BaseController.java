package com.greg.controller;

import com.greg.EmailManager;
import com.greg.view.ViewFactory;

public abstract class BaseController {

    private EmailManager emailManager;
    private ViewFactory viewFactory;
    private String fxmlFile;

    public BaseController(EmailManager emailManager, ViewFactory viewFactory, String fxmlFile) {
        this.emailManager = emailManager;
        this.viewFactory = viewFactory;
        this.fxmlFile = fxmlFile;
    }
}
