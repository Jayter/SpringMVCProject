package main.java.com.jayton.controller;

import main.java.com.jayton.model.Model;
import main.java.com.jayton.service.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/model/")
public class ModelController {

    @Autowired
    private ModelService modelService;

    @RequestMapping
    public ModelAndView getModel(@PathVariable(name = "id") int id) {
        ModelAndView modelAndView = new ModelAndView("model");

        Model model = modelService.getModel(id);

        modelAndView.addObject("model", model);

        return modelAndView;
    }

    @ExceptionHandler(value = {RuntimeException.class})
    public String handleException() {
        return "error";
    }
}
