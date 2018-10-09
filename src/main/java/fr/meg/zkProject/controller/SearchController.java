package fr.meg.zkProject.controller;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Label;

public class SearchController extends SelectorComposer<Component>  {

	private static final long serialVersionUID = 1L;
	
	@Wire
	private Label register;
	
	@Wire
	private Label login;
	

}
