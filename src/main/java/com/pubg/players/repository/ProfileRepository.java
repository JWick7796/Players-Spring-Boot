package com.pubg.players.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pubg.players.entity.Profile;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Long> {

	public Profile getProfileByUserName(String userName);

}
