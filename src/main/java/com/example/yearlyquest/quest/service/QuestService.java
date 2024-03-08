package com.example.yearlyquest.quest.service;

import com.example.yearlyquest.global.exception.quest.QuestNotFoundException;
import com.example.yearlyquest.member.entity.Member;
import com.example.yearlyquest.member.repository.MemberRepository;
import com.example.yearlyquest.quest.dto.QuestResponse;
import com.example.yearlyquest.quest.entity.Quest;
import com.example.yearlyquest.quest.repository.QuestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor

@Service
public class QuestService {

    private final MemberRepository memberRepository;
    private final QuestRepository questRepository;

    public QuestResponse getSingleQuest(Long id) {

        Quest quest = questRepository.findById(id).orElseThrow(() ->
                new QuestNotFoundException("해당 퀘스트가 존재하지 않습니다."));

        String username = findUsername(quest.getMemberId());

        return new QuestResponse(quest, username);
    }

    private String findUsername(Long id) {

        return memberRepository.findById(id).map(Member::getUsername)
                .orElse("탈퇴 회원");
    }
}
