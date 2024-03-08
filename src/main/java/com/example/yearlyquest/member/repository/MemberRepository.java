package com.example.yearlyquest.member.repository;

import com.example.yearlyquest.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

}
