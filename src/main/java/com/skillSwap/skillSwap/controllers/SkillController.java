package com.skillSwap.skillSwap.controllers;

import com.skillSwap.skillSwap.dtos.SkillDTO;
import com.skillSwap.skillSwap.services.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/skills")
@CrossOrigin(origins = "http://localhost:4200")
public class SkillController {

    @Autowired
    private SkillService skillService;

    @GetMapping
    public List<SkillDTO> getAllSkills() {
        return skillService.getAllSkills();
    }

    @GetMapping("/{id}")
    public Optional<SkillDTO> getSkillById(@PathVariable UUID id) {
        return skillService.getSkillById(id);
    }

    @PostMapping
    public SkillDTO createSkill(@RequestBody SkillDTO skillDTO) {
        return skillService.saveSkill(skillDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteSkill(@PathVariable UUID id) {
        skillService.deleteSkill(id);
    }
}
