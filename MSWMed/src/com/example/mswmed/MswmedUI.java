package com.example.mswmed;

import com.vaadin.server.ThemeResource;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.UI;

import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;


/**
 * Main UI class
 */
@SuppressWarnings("serial")
public class MswmedUI extends UI {

	private Label logLabel;
	
	@Override
	protected void init(VaadinRequest request) {
		buildLoginForm();
	}
	
	private void buildLoginForm(){
		//setMainWindow(new Window("Address Book Demo application"));
		VerticalLayout layout = new VerticalLayout();
		setContent(layout);
		layout.setSizeFull();
		
		FormLayout fl = new FormLayout(); 
		fl.setSizeUndefined();
		
		logLabel = new Label("MSWMed");
		
		logLabel.setIcon(new ThemeResource("../../../WebContent/WEB-INF/images/mswmed-logo.png"));
		fl.addComponent(logLabel);
		
		TextField tf = new TextField("U¿ytkownik");
		tf.setWidth("200");
		fl.addComponent(tf);
		
		tf.setRequired(true);
		tf.setRequiredError("Pole nie mo¿e byæ puste.");

		PasswordField pf1 = new PasswordField("Has³o");
		pf1.setRequired(true);
		pf1.setRequiredError("Pole nie mo¿e byæ puste.");
		pf1.setWidth("200");
		fl.addComponent(pf1);
		
		Button but_author_send = new Button("Zaloguj");
		fl.addComponent(but_author_send);
		
		but_author_send.addClickListener((ClickListener) this);

		layout.addComponent(fl);
		layout.setComponentAlignment(fl, Alignment.MIDDLE_CENTER);
		
	}
	
	@SuppressWarnings("unused")
	private boolean btnLogInClicked(ClickEvent e){
		
		logLabel.setCaption("Login Clicked!");
		return false;
	}
	

}