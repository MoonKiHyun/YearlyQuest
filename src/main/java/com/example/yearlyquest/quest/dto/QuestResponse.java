package com.example.yearlyquest.quest.dto;

import com.example.yearlyquest.quest.entity.Quest;
import com.example.yearlyquest.quest.entity.QuestType;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;

import java.time.LocalDateTime;

@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public record QuestResponse (
        String username,
        QuestType questType,
        String title,
        String description,
        Long likes,
        Long viewCount,
        LocalDateTime startDate,
        LocalDateTime endDate
) {
    public static QuestResponse of(Quest quest, String username) {

        return QuestResponse.builder()
                .username(username)
                .questType(quest.getQuestType())
                .title(quest.getTitle())
                .description(quest.getDescription())
                .likes(quest.getLikes())
                .viewCount(quest.getViewCount())
                .startDate(quest.getStartDate())
                .endDate(quest.getEndDate())
                .build();
    }
}