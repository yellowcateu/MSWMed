package com.mss.mswmed;


import com.vaadin.ui.Button;
import com.vaadin.ui.CustomLayout;  
import com.vaadin.ui.Notification;
import com.vaadin.ui.Panel;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
@SuppressWarnings("serial")
public class MSWMedLoginForm extends CustomLayout{

	public CustomLayout sample;

	private Panel panel;
	
	public MSWMedLoginForm() {

		
		
		panel = new Panel();
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
        	/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			public void buttonClick(ClickEvent event) {
				
				if (username.getValue().isEmpty()){
					Notification.show("Pole nie moze byæ puste!", com.vaadin.ui.Notification.Type.ERROR_MESSAGE);
				}else{
					Notification.show("Login user " + username.getValue(), com.vaadin.ui.Notification.Type.WARNING_MESSAGE);
				}
        	
        	}
        	});
        
        sample.addComponent(ok, "okbutton");
        
        
	}
	
	public Panel getPanel(){
	
		return this.panel;
	}
	

}
