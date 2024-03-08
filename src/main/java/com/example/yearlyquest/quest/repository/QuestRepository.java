package com.example.yearlyquest.quest.repository;

import com.example.yearlyquest.quest.entity.Quest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestRepository extends JpaRepository<Quest, Long> {

}
