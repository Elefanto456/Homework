package ru.kpfu.itis.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import ru.kpfu.itis.model.User;
import ru.kpfu.itis.repo.UserRepo;

import javax.validation.Valid;

@Controller
@RequestMapping("/project")
public class RegistrationController {

    @Autowired
    private UserRepo userRepo;

    @RequestMapping(value = "/userList", method = RequestMethod.GET)
    public String list(ModelMap map) {
        map.put("users", userRepo.findAll());
        return "userList";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String showRegForm(ModelMap map) {
        map.put("user", new User());
        return "registration";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String forRegistration(
            RedirectAttributes redirectAttributes,
            @ModelAttribute("user") @Valid User user,
            BindingResult result,
            ModelMap map
    ) {
        if (result.hasErrors()){
            return "registration";
        } else {
            userRepo.save(user);
            redirectAttributes.addFlashAttribute("message", "User \"" + user.getNickname() + "\" has been added successfully");
            return "redirect:" + MvcUriComponentsBuilder.fromMappingName("RC#showRegForm").build();
        }
    }

}