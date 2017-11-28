package com.peter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.peter.model.Exercise;

/**
 * @author Peter
 */
@Controller
public class MinutesController {

	@RequestMapping(value = "/addMinutes")
	public String addMinutes(@ModelAttribute ("exercise") Exercise exercise) {
		//the line above binds to 	<form:form commandName="exercise">
		System.out.println("exercise: " + exercise.getMinutes());
		return "addMinutes";
		
	}

}
