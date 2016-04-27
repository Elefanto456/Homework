package ru.kpfu.itis.controllers;

/*@Controller
@RequestMapping("/project")*/
public class SpringController {
/*
    @InitBinder
    private void initBinder(WebDataBinder binder) {
        binder.setValidator(new PhotoValidator());
    }

    @RequestMapping(value = "/forPhoto", method = RequestMethod.GET)
    public String photo(ModelMap map) {
        map.put("photo", new Photo());
        return "forPhoto";
    }

    @RequestMapping(value = "/forPhoto", method = RequestMethod.POST)
    public String springHandler(
            RedirectAttributes redirectAttributes,
            @Validated Photo photo,
            BindingResult result
    ) {
        if (result.hasErrors()) {
            return "forPhoto";
        } else {
            redirectAttributes.addFlashAttribute("message", "<span style=\"color:green\">Photo \"" + photo.getPath() + "\" has been added successfully</span>");
            return "redirect:" + MvcUriComponentsBuilder.fromMappingName("SC#photo").build();
        }

    }*/


}
