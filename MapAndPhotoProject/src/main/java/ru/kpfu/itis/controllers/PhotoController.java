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
import ru.kpfu.itis.model.Photo;
import ru.kpfu.itis.repo.PhotoRepo;

import javax.validation.Valid;

@Controller
@RequestMapping("/project")
public class PhotoController {

    @Autowired
    private PhotoRepo photoRepo;

    @RequestMapping(value = "/photoList", method = RequestMethod.GET)
    public String list(ModelMap map) {
        map.put("photos", photoRepo.findAll());
        return "list";
    }

    @RequestMapping(value = "/new_photo", method = RequestMethod.GET)
    public String add(ModelMap map) {
        map.put("photo", new Photo());
        return "forPhoto";
    }

    @RequestMapping(value = "/new_photo", method = RequestMethod.POST)
    public String formHandler(
            RedirectAttributes redirectAttributes,
            @ModelAttribute("photo") @Valid Photo photo,
            BindingResult result,
            ModelMap map
    ) {

        if (result.hasErrors()) {
            return "forPhoto";
        } else {
            photoRepo.save(photo);
            redirectAttributes.addFlashAttribute("message", "Photo \"" + photo.getPath() + "\" has been added successfully");
            redirectAttributes.addFlashAttribute("messageType", "success");
            return "redirect:" + MvcUriComponentsBuilder.fromMappingName("PC#add").build();
        }
    }
}