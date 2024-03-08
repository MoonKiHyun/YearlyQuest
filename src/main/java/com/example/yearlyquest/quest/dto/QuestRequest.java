package com.example.yearlyquest.quest.dto;

import com.example.yearlyquest.quest.entity.QuestType;

import java.time.LocalDateTime;

public record QuestRequest (
        QuestType questType,
        String title,
        String description,
        Long likes,
        Long viewCount,
        LocalDateTime startDate,
        LocalDateTime endDate
) {}
