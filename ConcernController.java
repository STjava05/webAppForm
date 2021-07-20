package it.ousssein.concern.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import it.ousssein.concern.entity.Concern;
import it.ousssein.concern.repository.ConcernRepository;
@RestController
public class ConcernController {

	@Autowired
	private ConcernRepository concernRepository;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView concern() {
		ModelAndView citizen = new ModelAndView();
		citizen.setViewName("concern");
		List<Concern> listConcern = concernRepository.findAll();
		citizen.addObject("listConcern", listConcern);
		citizen.addObject("concern", new Concern());
		return citizen;
	}

	@GetMapping("/concerns")
	public Iterable<Concern> getAllConcerns(Model model) {
		return concernRepository.findAll();
	}

	@GetMapping("/getConcerns/{id}")
	public Concern getConcern(@PathVariable int id) {
		return concernRepository.findById(id);
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public ModelAndView add(@Validated Concern concern, BindingResult bindingResult) {
		ModelAndView citizen = new ModelAndView();
		concernRepository.save(concern);
		List<Concern> listConcern = concernRepository.findAll();
		citizen.addObject("listConcern", concern);
		citizen.addObject("concern", new Concern());
		citizen.setViewName("concern");
		return citizen;

	}
	
}
