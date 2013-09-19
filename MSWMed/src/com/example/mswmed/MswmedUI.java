package com.example.mswmed;

import java.io.File;

import com.vaadin.server.FileResource;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinService;
import com.vaadin.ui.UI;

import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Image;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;


/**
 * Main UI class
 */
@SuppressWarnings("serial")
public class MswmedUI extends UI {
	
	@Override
	protected void init(VaadinRequest request) {
		buildLoginForm();
	}
	
	private void buildLoginForm(){
		VerticalLayout layout = new VerticalLayout();
		setContent(layout);
		layout.setSizeFull();
		
		HorizontalLayout hl = new HorizontalLayout();
		hl.setSizeUndefined();
		
		FormLayout fl = new FormLayout(); 
		fl.setSizeUndefined();

		String basepath = VaadinService.getCurrent().getBaseDirectory().getAbsolutePath();

		FileResource resource = new FileResource(new File(basepath +"/WEB-INF/images/mswmed-logo.png"));

		Image image = new Image("", resource);
		hl.addComponent(image);
		
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
		
		Button button = new Button("Zaloguj");

		//button.addClickListener((ClickListener) this);
		
		fl.addComponent(button);
		hl.addComponent(fl);
		layout.addComponent(hl);
		layout.setComponentAlignment(hl, Alignment.MIDDLE_CENTER);
		
	}	

}