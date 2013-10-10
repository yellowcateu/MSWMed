package com.mss.mswmed;

import java.io.File;

import com.google.debugging.sourcemap.dev.protobuf.DescriptorProtos.FieldDescriptorProto.Type;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.server.FileResource;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinService;
import com.vaadin.ui.UI;

import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.CustomLayout;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Image;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Panel;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;


/**
 * Main UI class
 */
@Theme("mswmedtheme")
@Title("MSWMed by Medical Systems Solution")
@SuppressWarnings("serial")
public class MswmedUI extends UI {
	
	@Override
	protected void init(VaadinRequest request) {
		buildCustomForm();
	}
	
	private void buildCustomForm(){
		
		VerticalLayout layout = new VerticalLayout();
		setContent(layout);
		layout.setSizeFull();
		
		
		Panel panel = new Panel();
		panel.setSizeUndefined();

		
        CustomLayout sample = new CustomLayout("loginPanel");
        panel.setContent(sample);
        // Create components and bind them to the location tags
        // in the custom layout.
        final TextField username = new TextField();
        username.setWidth("250");
        username.setRequired(true);
        username.setRequiredError("Pole nie moze byæ puste");
        sample.addComponent(username, "username");

        final PasswordField password = new PasswordField();
        password.setWidth("250");
        password.setRequired(true);
        password.setRequiredError("Pole nie moze byæ puste");
        sample.addComponent(password, "password");

        Button ok = new Button("Login");
        
        ok.addClickListener(new ClickListener() {
        	public void buttonClick(ClickEvent event) {
        	Notification.show("Login user " + username.getValue(), com.vaadin.ui.Notification.Type.WARNING_MESSAGE);
        	}
        	});
        
        sample.addComponent(ok, "okbutton");
        
        layout.addComponent(panel);
        layout.setComponentAlignment(panel, Alignment.MIDDLE_CENTER);
	}

}