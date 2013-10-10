package com.mss.mswmed;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Panel;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

import com.vaadin.ui.Alignment;


/**
 * Main UI class
 */
@Theme("mswmedtheme")
@Title("MSWMed")
@SuppressWarnings("serial")
public class MswmedUI extends UI {
	
	@Override
	protected void init(VaadinRequest request) {
		VerticalLayout layout = new VerticalLayout();
		setContent(layout);
		layout.setSizeFull();
		
		MSWMedLoginForm lf = new MSWMedLoginForm();
		Panel sample = lf.getPanel();
		
		layout.addComponent(sample);
        layout.setComponentAlignment(sample, Alignment.MIDDLE_CENTER);
	}
	
}