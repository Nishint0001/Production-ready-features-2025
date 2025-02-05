package com.nishintgoyal.prod_ready_features2025.repositories;

import com.nishintgoyal.prod_ready_features2025.entities.PostEntity;
import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<PostEntity,Long>
{

}
