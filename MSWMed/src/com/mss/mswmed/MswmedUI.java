package com.mss.mswmed;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.UI;

import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.CustomLayout;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Panel;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;


/**
 * Main UI class
 */
@Theme("mswmedtheme")
@Title("MSWMed")
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
        final TextField username = new TextField("U¿ytkownik");
        username.setWidth("405");
        username.setRequired(true);
        username.setRequiredError("Pole nie mo¿e byæ puste");
        sample.addComponent(username, "username");

        final PasswordField password = new PasswordField("Has³o");
        password.setRequired(true);
        password.setRequiredError("Pole nie mo¿e byæ puste");
        password.setWidth("405");
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