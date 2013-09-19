package com.example.mswmed;

import com.vaadin.ui.Button;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;

public class LoginForm {

	public LoginForm() {
		// TODO Auto-generated constructor stub
		
		FormLayout fl = new FormLayout();
		
		TextField tf = new TextField("U¿ytkownik");
		tf.setWidth("200");
		fl.addComponent(tf);
		

		// Mark the first field as required
		tf.setRequired(true);
		tf.setRequiredError("Pole nie mo¿e byæ puste.");

		PasswordField pf1 = new PasswordField("Has³o");
		pf1.setRequired(true);
		pf1.setRequiredError("Pole nie mo¿e byæ puste.");
		pf1.setWidth("200");
		fl.addComponent(pf1);
		
		Button but_author_send = new Button("Zaloguj");
		fl.addComponent(but_author_send);
	}

}
