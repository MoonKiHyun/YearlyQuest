package com.example.yearlyquest.quest.controller;

import com.example.yearlyquest.quest.dto.QuestResponse;
import com.example.yearlyquest.quest.service.QuestService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor

@RestController
@RequestMapping("/api/quest")
public class QuestController {

    private final QuestService questService;

    @GetMapping("/{id}")
    public ResponseEntity<QuestResponse> getSingleQuest(@PathVariable Long id) {

        QuestResponse response = questService.getSingleQuest(id);

        return ResponseEntity.ok().body(response);
    }
}
