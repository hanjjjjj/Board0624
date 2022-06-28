package com.its.board.repository;

import org.hibernate.engine.spi.ManagedEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<MemberRepository,Long> {
}
